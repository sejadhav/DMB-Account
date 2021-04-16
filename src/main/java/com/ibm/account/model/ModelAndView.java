package com.ibm.account.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ibm.account.model.View;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModelAndView
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:09:28.190Z[GMT]")

public class ModelAndView   {
  @JsonProperty("empty")
  private Boolean empty;

  @JsonProperty("model")
  private Object model = null;

  @JsonProperty("modelMap")
  @Valid
  private Map<String, Object> modelMap = null;

  @JsonProperty("reference")
  private Boolean reference;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACCEPTED("ACCEPTED"),
    
    ALREADY_REPORTED("ALREADY_REPORTED"),
    
    BAD_GATEWAY("BAD_GATEWAY"),
    
    BAD_REQUEST("BAD_REQUEST"),
    
    BANDWIDTH_LIMIT_EXCEEDED("BANDWIDTH_LIMIT_EXCEEDED"),
    
    CHECKPOINT("CHECKPOINT"),
    
    CONFLICT("CONFLICT"),
    
    CONTINUE("CONTINUE"),
    
    CREATED("CREATED"),
    
    DESTINATION_LOCKED("DESTINATION_LOCKED"),
    
    EXPECTATION_FAILED("EXPECTATION_FAILED"),
    
    FAILED_DEPENDENCY("FAILED_DEPENDENCY"),
    
    FORBIDDEN("FORBIDDEN"),
    
    FOUND("FOUND"),
    
    GATEWAY_TIMEOUT("GATEWAY_TIMEOUT"),
    
    GONE("GONE"),
    
    HTTP_VERSION_NOT_SUPPORTED("HTTP_VERSION_NOT_SUPPORTED"),
    
    IM_USED("IM_USED"),
    
    INSUFFICIENT_SPACE_ON_RESOURCE("INSUFFICIENT_SPACE_ON_RESOURCE"),
    
    INSUFFICIENT_STORAGE("INSUFFICIENT_STORAGE"),
    
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR"),
    
    I_AM_A_TEAPOT("I_AM_A_TEAPOT"),
    
    LENGTH_REQUIRED("LENGTH_REQUIRED"),
    
    LOCKED("LOCKED"),
    
    LOOP_DETECTED("LOOP_DETECTED"),
    
    METHOD_FAILURE("METHOD_FAILURE"),
    
    METHOD_NOT_ALLOWED("METHOD_NOT_ALLOWED"),
    
    MOVED_PERMANENTLY("MOVED_PERMANENTLY"),
    
    MOVED_TEMPORARILY("MOVED_TEMPORARILY"),
    
    MULTIPLE_CHOICES("MULTIPLE_CHOICES"),
    
    MULTI_STATUS("MULTI_STATUS"),
    
    NETWORK_AUTHENTICATION_REQUIRED("NETWORK_AUTHENTICATION_REQUIRED"),
    
    NON_AUTHORITATIVE_INFORMATION("NON_AUTHORITATIVE_INFORMATION"),
    
    NOT_ACCEPTABLE("NOT_ACCEPTABLE"),
    
    NOT_EXTENDED("NOT_EXTENDED"),
    
    NOT_FOUND("NOT_FOUND"),
    
    NOT_IMPLEMENTED("NOT_IMPLEMENTED"),
    
    NOT_MODIFIED("NOT_MODIFIED"),
    
    NO_CONTENT("NO_CONTENT"),
    
    OK("OK"),
    
    PARTIAL_CONTENT("PARTIAL_CONTENT"),
    
    PAYLOAD_TOO_LARGE("PAYLOAD_TOO_LARGE"),
    
    PAYMENT_REQUIRED("PAYMENT_REQUIRED"),
    
    PERMANENT_REDIRECT("PERMANENT_REDIRECT"),
    
    PRECONDITION_FAILED("PRECONDITION_FAILED"),
    
    PRECONDITION_REQUIRED("PRECONDITION_REQUIRED"),
    
    PROCESSING("PROCESSING"),
    
    PROXY_AUTHENTICATION_REQUIRED("PROXY_AUTHENTICATION_REQUIRED"),
    
    REQUESTED_RANGE_NOT_SATISFIABLE("REQUESTED_RANGE_NOT_SATISFIABLE"),
    
    REQUEST_ENTITY_TOO_LARGE("REQUEST_ENTITY_TOO_LARGE"),
    
    REQUEST_HEADER_FIELDS_TOO_LARGE("REQUEST_HEADER_FIELDS_TOO_LARGE"),
    
    REQUEST_TIMEOUT("REQUEST_TIMEOUT"),
    
    REQUEST_URI_TOO_LONG("REQUEST_URI_TOO_LONG"),
    
    RESET_CONTENT("RESET_CONTENT"),
    
    SEE_OTHER("SEE_OTHER"),
    
    SERVICE_UNAVAILABLE("SERVICE_UNAVAILABLE"),
    
    SWITCHING_PROTOCOLS("SWITCHING_PROTOCOLS"),
    
    TEMPORARY_REDIRECT("TEMPORARY_REDIRECT"),
    
    TOO_EARLY("TOO_EARLY"),
    
    TOO_MANY_REQUESTS("TOO_MANY_REQUESTS"),
    
    UNAUTHORIZED("UNAUTHORIZED"),
    
    UNAVAILABLE_FOR_LEGAL_REASONS("UNAVAILABLE_FOR_LEGAL_REASONS"),
    
    UNPROCESSABLE_ENTITY("UNPROCESSABLE_ENTITY"),
    
    UNSUPPORTED_MEDIA_TYPE("UNSUPPORTED_MEDIA_TYPE"),
    
    UPGRADE_REQUIRED("UPGRADE_REQUIRED"),
    
    URI_TOO_LONG("URI_TOO_LONG"),
    
    USE_PROXY("USE_PROXY"),
    
    VARIANT_ALSO_NEGOTIATES("VARIANT_ALSO_NEGOTIATES");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("view")
  private View view = null;

  @JsonProperty("viewName")
  private String viewName;

  public ModelAndView empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * Get empty
   * @return empty
  */
  @ApiModelProperty(value = "")


  public Boolean getEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  public ModelAndView model(Object model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getModel() {
    return model;
  }

  public void setModel(Object model) {
    this.model = model;
  }

  public ModelAndView modelMap(Map<String, Object> modelMap) {
    this.modelMap = modelMap;
    return this;
  }

  public ModelAndView putModelMapItem(String key, Object modelMapItem) {
    if (this.modelMap == null) {
      this.modelMap = new HashMap<String, Object>();
    }
    this.modelMap.put(key, modelMapItem);
    return this;
  }

  /**
   * Get modelMap
   * @return modelMap
  */
  @ApiModelProperty(value = "")


  public Map<String, Object> getModelMap() {
    return modelMap;
  }

  public void setModelMap(Map<String, Object> modelMap) {
    this.modelMap = modelMap;
  }

  public ModelAndView reference(Boolean reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  @ApiModelProperty(value = "")


  public Boolean getReference() {
    return reference;
  }

  public void setReference(Boolean reference) {
    this.reference = reference;
  }

  public ModelAndView status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ModelAndView view(View view) {
    this.view = view;
    return this;
  }

  /**
   * Get view
   * @return view
  */
  @ApiModelProperty(value = "")

  @Valid

  public View getView() {
    return view;
  }

  public void setView(View view) {
    this.view = view;
  }

  public ModelAndView viewName(String viewName) {
    this.viewName = viewName;
    return this;
  }

  /**
   * Get viewName
   * @return viewName
  */
  @ApiModelProperty(value = "")


  public String getViewName() {
    return viewName;
  }

  public void setViewName(String viewName) {
    this.viewName = viewName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAndView modelAndView = (ModelAndView) o;
    return Objects.equals(this.empty, modelAndView.empty) &&
        Objects.equals(this.model, modelAndView.model) &&
        Objects.equals(this.modelMap, modelAndView.modelMap) &&
        Objects.equals(this.reference, modelAndView.reference) &&
        Objects.equals(this.status, modelAndView.status) &&
        Objects.equals(this.view, modelAndView.view) &&
        Objects.equals(this.viewName, modelAndView.viewName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empty, model, modelMap, reference, status, view, viewName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAndView {\n");
    
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    modelMap: ").append(toIndentedString(modelMap)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

