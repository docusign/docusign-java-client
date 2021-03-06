package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ReportInProductRunResponseRowFields;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ReportInProductRunResponseRow
 */

public class ReportInProductRunResponseRow {
  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("fields")
  private ReportInProductRunResponseRowFields fields = null;

  public ReportInProductRunResponseRow envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

   /**
   * The envelope ID of the envelope status that failed to post.
   * @return envelopeId
  **/
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public ReportInProductRunResponseRow fields(ReportInProductRunResponseRowFields fields) {
    this.fields = fields;
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @ApiModelProperty(value = "")
  public ReportInProductRunResponseRowFields getFields() {
    return fields;
  }

  public void setFields(ReportInProductRunResponseRowFields fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportInProductRunResponseRow reportInProductRunResponseRow = (ReportInProductRunResponseRow) o;
    return Objects.equals(this.envelopeId, reportInProductRunResponseRow.envelopeId) &&
        Objects.equals(this.fields, reportInProductRunResponseRow.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductRunResponseRow {\n");
    
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

