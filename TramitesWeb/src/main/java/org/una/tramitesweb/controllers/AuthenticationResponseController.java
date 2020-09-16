package org.una.tramitesweb.controllers;

import org.una.tramitesweb.DTO.AuthenticationResponse;
import org.una.tramitesweb.util.JsfUtil;
import org.una.tramitesweb.util.PaginationHelper;

import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;
import org.una.tramitesweb.facade.AuthenticationResponseFacade;

@Named("authenticationResponseController")
@SessionScoped
public class AuthenticationResponseController implements Serializable {

    private AuthenticationResponse current;
    private DataModel items = null;
    @EJB
    private org.una.tramitesweb.facade.AuthenticationResponseFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public AuthenticationResponseController() {
    }

    public AuthenticationResponse getSelected() {
        if (current == null) {
            current = new AuthenticationResponse();
            selectedItemIndex = -1;
        }
        return current;
    }

    private AuthenticationResponseFacade getFacade() {
        return ejbFacade;
    }

    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {

                @Override
                public int getItemsCount() {
                    return getFacade().count();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel(getFacade().findRange(new int[]{getPageFirstItem(), getPageFirstItem() + getPageSize()}));
                }
            };
        }
        return pagination;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareView() {
        current = (AuthenticationResponse) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new AuthenticationResponse();
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/labelsform/Bundle").getString("AuthenticationResponseCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/labelsform/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (AuthenticationResponse) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/labelsform/Bundle").getString("AuthenticationResponseUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/labelsform/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (AuthenticationResponse) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        performDestroy();
        recreatePagination();
        recreateModel();
        return "List";
    }

    public String destroyAndView() {
        performDestroy();
        recreateModel();
        updateCurrentItem();
        if (selectedItemIndex >= 0) {
            return "View";
        } else {
            // all items were removed - go back to list
            recreateModel();
            return "List";
        }
    }

    private void performDestroy() {
        try {
            getFacade().remove(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/labelsform/Bundle").getString("AuthenticationResponseDeleted"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/labelsform/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    private void updateCurrentItem() {
        int count = getFacade().count();
        if (selectedItemIndex >= count) {
            // selected index cannot be bigger than number of items:
            selectedItemIndex = count - 1;
            // go to previous page if last page disappeared:
            if (pagination.getPageFirstItem() >= count) {
                pagination.previousPage();
            }
        }
        if (selectedItemIndex >= 0) {
            current = getFacade().findRange(new int[]{selectedItemIndex, selectedItemIndex + 1}).get(0);
        }
    }

    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    private void recreatePagination() {
        pagination = null;
    }

    public String next() {
        getPagination().nextPage();
        recreateModel();
        return "List";
    }

    public String previous() {
        getPagination().previousPage();
        recreateModel();
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    public AuthenticationResponse getAuthenticationResponse(UNDEFINED_PK_TYPE id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = AuthenticationResponse.class)
    public static class AuthenticationResponseControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            AuthenticationResponseController controller = (AuthenticationResponseController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "authenticationResponseController");
            return controller.getAuthenticationResponse(getKey(value));
        }

        UNDEFINED_PK_TYPE getKey(String value) {
            UNDEFINED_PK_TYPE key;
            // TODO: no getter methods were found for primary key in your entity class
            //    org.una.tramitesweb.AuthenticationResponse 
            // and therefore Converter.getKey() method could not be pre-generated.
            return key;
        }

        String getStringKey(UNDEFINED_PK_TYPE value) {
            StringBuilder sb = new StringBuilder();
            // TODO: no getter methods were found for primary key in your entity class
            //    org.una.tramitesweb.AuthenticationResponse 
            // and therefore Converter.getKey() method could not be pre-generated.
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof AuthenticationResponse) {
                AuthenticationResponse o = (AuthenticationResponse) object;
                return getStringKey(o.UNDEFINED_PK_GETTER());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + AuthenticationResponse.class.getName());
            }
        }

    }

}
