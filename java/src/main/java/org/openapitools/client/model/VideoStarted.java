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
import org.openapitools.client.model.VideoStartedAllOf;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The video is started
 */
@ApiModel(description = "The video is started")
@JsonPropertyOrder({
  VideoStarted.JSON_PROPERTY_VIDEO_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-05T14:37:31.390937+01:00[Europe/Budapest]")
public class VideoStarted extends Arg {
  public static final String JSON_PROPERTY_VIDEO_URL = "videoUrl";
  private String videoUrl;


  public VideoStarted videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * Get videoUrl
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoStarted videoStarted = (VideoStarted) o;
    return Objects.equals(this.videoUrl, videoStarted.videoUrl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoUrl, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoStarted {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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

