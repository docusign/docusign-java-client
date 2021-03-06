package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Agent;
import com.docusign.esign.model.CarbonCopy;
import com.docusign.esign.model.CertifiedDelivery;
import com.docusign.esign.model.Editor;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.InPersonSigner;
import com.docusign.esign.model.Intermediary;
import com.docusign.esign.model.NotaryRecipient;
import com.docusign.esign.model.SealSign;
import com.docusign.esign.model.Signer;
import com.docusign.esign.model.Witness;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TemplateRecipients
 */

public class TemplateRecipients {
  @JsonProperty("agents")
  private java.util.List<Agent> agents = null;

  @JsonProperty("carbonCopies")
  private java.util.List<CarbonCopy> carbonCopies = null;

  @JsonProperty("certifiedDeliveries")
  private java.util.List<CertifiedDelivery> certifiedDeliveries = null;

  @JsonProperty("currentRoutingOrder")
  private String currentRoutingOrder = null;

  @JsonProperty("editors")
  private java.util.List<Editor> editors = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("inPersonSigners")
  private java.util.List<InPersonSigner> inPersonSigners = null;

  @JsonProperty("intermediaries")
  private java.util.List<Intermediary> intermediaries = null;

  @JsonProperty("notaries")
  private java.util.List<NotaryRecipient> notaries = null;

  @JsonProperty("recipientCount")
  private String recipientCount = null;

  @JsonProperty("seals")
  private java.util.List<SealSign> seals = null;

  @JsonProperty("signers")
  private java.util.List<Signer> signers = null;

  @JsonProperty("witnesses")
  private java.util.List<Witness> witnesses = null;

  public TemplateRecipients agents(java.util.List<Agent> agents) {
    this.agents = agents;
    return this;
  }

  public TemplateRecipients addAgentsItem(Agent agentsItem) {
    if (this.agents == null) {
      this.agents = new java.util.ArrayList<Agent>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * A complex type defining the management and access rights of a recipient assigned assigned as an agent on the document.
   * @return agents
  **/
  @ApiModelProperty(value = "A complex type defining the management and access rights of a recipient assigned assigned as an agent on the document.")
  public java.util.List<Agent> getAgents() {
    return agents;
  }

  public void setAgents(java.util.List<Agent> agents) {
    this.agents = agents;
  }

  public TemplateRecipients carbonCopies(java.util.List<CarbonCopy> carbonCopies) {
    this.carbonCopies = carbonCopies;
    return this;
  }

  public TemplateRecipients addCarbonCopiesItem(CarbonCopy carbonCopiesItem) {
    if (this.carbonCopies == null) {
      this.carbonCopies = new java.util.ArrayList<CarbonCopy>();
    }
    this.carbonCopies.add(carbonCopiesItem);
    return this;
  }

   /**
   * A complex type containing information about recipients who should receive a copy of the envelope, but does not need to sign it.
   * @return carbonCopies
  **/
  @ApiModelProperty(value = "A complex type containing information about recipients who should receive a copy of the envelope, but does not need to sign it.")
  public java.util.List<CarbonCopy> getCarbonCopies() {
    return carbonCopies;
  }

  public void setCarbonCopies(java.util.List<CarbonCopy> carbonCopies) {
    this.carbonCopies = carbonCopies;
  }

  public TemplateRecipients certifiedDeliveries(java.util.List<CertifiedDelivery> certifiedDeliveries) {
    this.certifiedDeliveries = certifiedDeliveries;
    return this;
  }

  public TemplateRecipients addCertifiedDeliveriesItem(CertifiedDelivery certifiedDeliveriesItem) {
    if (this.certifiedDeliveries == null) {
      this.certifiedDeliveries = new java.util.ArrayList<CertifiedDelivery>();
    }
    this.certifiedDeliveries.add(certifiedDeliveriesItem);
    return this;
  }

   /**
   * A complex type containing information on a recipient the must receive the completed documents for the envelope to be completed, but the recipient does not need to sign, initial, date, or add information to any of the documents.
   * @return certifiedDeliveries
  **/
  @ApiModelProperty(value = "A complex type containing information on a recipient the must receive the completed documents for the envelope to be completed, but the recipient does not need to sign, initial, date, or add information to any of the documents.")
  public java.util.List<CertifiedDelivery> getCertifiedDeliveries() {
    return certifiedDeliveries;
  }

  public void setCertifiedDeliveries(java.util.List<CertifiedDelivery> certifiedDeliveries) {
    this.certifiedDeliveries = certifiedDeliveries;
  }

  public TemplateRecipients currentRoutingOrder(String currentRoutingOrder) {
    this.currentRoutingOrder = currentRoutingOrder;
    return this;
  }

   /**
   * 
   * @return currentRoutingOrder
  **/
  @ApiModelProperty(value = "")
  public String getCurrentRoutingOrder() {
    return currentRoutingOrder;
  }

  public void setCurrentRoutingOrder(String currentRoutingOrder) {
    this.currentRoutingOrder = currentRoutingOrder;
  }

  public TemplateRecipients editors(java.util.List<Editor> editors) {
    this.editors = editors;
    return this;
  }

  public TemplateRecipients addEditorsItem(Editor editorsItem) {
    if (this.editors == null) {
      this.editors = new java.util.ArrayList<Editor>();
    }
    this.editors.add(editorsItem);
    return this;
  }

   /**
   * 
   * @return editors
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Editor> getEditors() {
    return editors;
  }

  public void setEditors(java.util.List<Editor> editors) {
    this.editors = editors;
  }

  public TemplateRecipients errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public TemplateRecipients inPersonSigners(java.util.List<InPersonSigner> inPersonSigners) {
    this.inPersonSigners = inPersonSigners;
    return this;
  }

  public TemplateRecipients addInPersonSignersItem(InPersonSigner inPersonSignersItem) {
    if (this.inPersonSigners == null) {
      this.inPersonSigners = new java.util.ArrayList<InPersonSigner>();
    }
    this.inPersonSigners.add(inPersonSignersItem);
    return this;
  }

   /**
   * Specifies a signer that is in the same physical location as a DocuSign user who will act as a Signing Host for the transaction. The recipient added is the Signing Host and new separate Signer Name field appears after Sign in person is selected.
   * @return inPersonSigners
  **/
  @ApiModelProperty(value = "Specifies a signer that is in the same physical location as a DocuSign user who will act as a Signing Host for the transaction. The recipient added is the Signing Host and new separate Signer Name field appears after Sign in person is selected.")
  public java.util.List<InPersonSigner> getInPersonSigners() {
    return inPersonSigners;
  }

  public void setInPersonSigners(java.util.List<InPersonSigner> inPersonSigners) {
    this.inPersonSigners = inPersonSigners;
  }

  public TemplateRecipients intermediaries(java.util.List<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
    return this;
  }

  public TemplateRecipients addIntermediariesItem(Intermediary intermediariesItem) {
    if (this.intermediaries == null) {
      this.intermediaries = new java.util.ArrayList<Intermediary>();
    }
    this.intermediaries.add(intermediariesItem);
    return this;
  }

   /**
   * Identifies a recipient that can, but is not required to, add name and email information for recipients at the same or subsequent level in the routing order (until subsequent Agents, Editors or Intermediaries recipient types are added).
   * @return intermediaries
  **/
  @ApiModelProperty(value = "Identifies a recipient that can, but is not required to, add name and email information for recipients at the same or subsequent level in the routing order (until subsequent Agents, Editors or Intermediaries recipient types are added).")
  public java.util.List<Intermediary> getIntermediaries() {
    return intermediaries;
  }

  public void setIntermediaries(java.util.List<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
  }

  public TemplateRecipients notaries(java.util.List<NotaryRecipient> notaries) {
    this.notaries = notaries;
    return this;
  }

  public TemplateRecipients addNotariesItem(NotaryRecipient notariesItem) {
    if (this.notaries == null) {
      this.notaries = new java.util.ArrayList<NotaryRecipient>();
    }
    this.notaries.add(notariesItem);
    return this;
  }

   /**
   * 
   * @return notaries
  **/
  @ApiModelProperty(value = "")
  public java.util.List<NotaryRecipient> getNotaries() {
    return notaries;
  }

  public void setNotaries(java.util.List<NotaryRecipient> notaries) {
    this.notaries = notaries;
  }

  public TemplateRecipients recipientCount(String recipientCount) {
    this.recipientCount = recipientCount;
    return this;
  }

   /**
   * The list of recipient event statuses that will trigger Connect to send updates to the url. It can be a two-part list with:  * recipientEventStatusCode - The recipient status, this can be Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded. * includeDocuments - When set to **true**, the envelope time zone information is included in the message.
   * @return recipientCount
  **/
  @ApiModelProperty(value = "The list of recipient event statuses that will trigger Connect to send updates to the url. It can be a two-part list with:  * recipientEventStatusCode - The recipient status, this can be Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded. * includeDocuments - When set to **true**, the envelope time zone information is included in the message.")
  public String getRecipientCount() {
    return recipientCount;
  }

  public void setRecipientCount(String recipientCount) {
    this.recipientCount = recipientCount;
  }

  public TemplateRecipients seals(java.util.List<SealSign> seals) {
    this.seals = seals;
    return this;
  }

  public TemplateRecipients addSealsItem(SealSign sealsItem) {
    if (this.seals == null) {
      this.seals = new java.util.ArrayList<SealSign>();
    }
    this.seals.add(sealsItem);
    return this;
  }

   /**
   * 
   * @return seals
  **/
  @ApiModelProperty(value = "")
  public java.util.List<SealSign> getSeals() {
    return seals;
  }

  public void setSeals(java.util.List<SealSign> seals) {
    this.seals = seals;
  }

  public TemplateRecipients signers(java.util.List<Signer> signers) {
    this.signers = signers;
    return this;
  }

  public TemplateRecipients addSignersItem(Signer signersItem) {
    if (this.signers == null) {
      this.signers = new java.util.ArrayList<Signer>();
    }
    this.signers.add(signersItem);
    return this;
  }

   /**
   * A complex type containing information about the Signer recipient.
   * @return signers
  **/
  @ApiModelProperty(value = "A complex type containing information about the Signer recipient.")
  public java.util.List<Signer> getSigners() {
    return signers;
  }

  public void setSigners(java.util.List<Signer> signers) {
    this.signers = signers;
  }

  public TemplateRecipients witnesses(java.util.List<Witness> witnesses) {
    this.witnesses = witnesses;
    return this;
  }

  public TemplateRecipients addWitnessesItem(Witness witnessesItem) {
    if (this.witnesses == null) {
      this.witnesses = new java.util.ArrayList<Witness>();
    }
    this.witnesses.add(witnessesItem);
    return this;
  }

   /**
   * 
   * @return witnesses
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Witness> getWitnesses() {
    return witnesses;
  }

  public void setWitnesses(java.util.List<Witness> witnesses) {
    this.witnesses = witnesses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateRecipients templateRecipients = (TemplateRecipients) o;
    return Objects.equals(this.agents, templateRecipients.agents) &&
        Objects.equals(this.carbonCopies, templateRecipients.carbonCopies) &&
        Objects.equals(this.certifiedDeliveries, templateRecipients.certifiedDeliveries) &&
        Objects.equals(this.currentRoutingOrder, templateRecipients.currentRoutingOrder) &&
        Objects.equals(this.editors, templateRecipients.editors) &&
        Objects.equals(this.errorDetails, templateRecipients.errorDetails) &&
        Objects.equals(this.inPersonSigners, templateRecipients.inPersonSigners) &&
        Objects.equals(this.intermediaries, templateRecipients.intermediaries) &&
        Objects.equals(this.notaries, templateRecipients.notaries) &&
        Objects.equals(this.recipientCount, templateRecipients.recipientCount) &&
        Objects.equals(this.seals, templateRecipients.seals) &&
        Objects.equals(this.signers, templateRecipients.signers) &&
        Objects.equals(this.witnesses, templateRecipients.witnesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agents, carbonCopies, certifiedDeliveries, currentRoutingOrder, editors, errorDetails, inPersonSigners, intermediaries, notaries, recipientCount, seals, signers, witnesses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateRecipients {\n");
    
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    carbonCopies: ").append(toIndentedString(carbonCopies)).append("\n");
    sb.append("    certifiedDeliveries: ").append(toIndentedString(certifiedDeliveries)).append("\n");
    sb.append("    currentRoutingOrder: ").append(toIndentedString(currentRoutingOrder)).append("\n");
    sb.append("    editors: ").append(toIndentedString(editors)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    inPersonSigners: ").append(toIndentedString(inPersonSigners)).append("\n");
    sb.append("    intermediaries: ").append(toIndentedString(intermediaries)).append("\n");
    sb.append("    notaries: ").append(toIndentedString(notaries)).append("\n");
    sb.append("    recipientCount: ").append(toIndentedString(recipientCount)).append("\n");
    sb.append("    seals: ").append(toIndentedString(seals)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    witnesses: ").append(toIndentedString(witnesses)).append("\n");
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

