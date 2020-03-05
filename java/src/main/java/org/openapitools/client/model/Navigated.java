/*
 * Events
 * Polymorphism example
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.client.model.Arg;
import org.openapitools.client.model.NavigatedAllOf;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The user performed navigation
 */
@ApiModel(description = "The user performed navigation")
@JsonPropertyOrder({
  Navigated.JSON_PROPERTY_NEW_PATH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-05T14:23:16.192147+01:00[Europe/Budapest]")
public class Navigated extends Arg {
  public static final String JSON_PROPERTY_NEW_PATH = "newPath";
  private String newPath;


  public Navigated newPath(String newPath) {
    
    this.newPath = newPath;
    return this;
  }

   /**
   * Get newPath
   * @return newPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEW_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewPath() {
    return newPath;
  }


  public void setNewPath(String newPath) {
    this.newPath = newPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Navigated navigated = (Navigated) o;
    return Objects.equals(this.newPath, navigated.newPath) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newPath, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Navigated {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
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

