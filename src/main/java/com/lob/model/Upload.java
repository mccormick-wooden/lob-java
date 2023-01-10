/*
 * Lob
 * The Lob API is organized around REST. Our API is designed to have predictable, resource-oriented URLs and uses HTTP response codes to indicate any API errors. <p> Looking for our [previous documentation](https://lob.github.io/legacy-docs/)?
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: lob-openapi@lob.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


 package com.lob.model;

 import java.util.Objects;
 import java.util.Arrays;
 import com.google.gson.TypeAdapter;
 import com.google.gson.annotations.JsonAdapter;
 import com.google.gson.annotations.SerializedName;
 import com.google.gson.stream.JsonReader;
 import com.google.gson.stream.JsonWriter;
 import com.lob.model.OptionalAddressColumnMapping;
 import com.lob.model.RequiredAddressColumnMapping;
 import com.lob.model.UploadsMetadata;
 import io.swagger.annotations.ApiModel;
 import io.swagger.annotations.ApiModelProperty;
 import java.io.IOException;
 import java.time.OffsetDateTime;
 
 import com.google.gson.Gson;
 /**
  * Upload
  */
 @javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
 public class Upload {
   public static final String SERIALIZED_NAME_ID = "id";
 
   @SerializedName(SERIALIZED_NAME_ID)
 
 
   private String id;
   /**
   * Unique identifier prefixed with `upl_`.
   * @return id
   **/
 
   @javax.annotation.Nonnull
 
   public String getId() { return id; }
 
   public void setId (String id) throws IllegalArgumentException {
     if(!id.matches("^upl_[a-zA-Z0-9]+$")) {
       throw new IllegalArgumentException("Invalid id provided");
     }
 
     this.id = id;
   }
 
 
 
   public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
 
   @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
 
 
   private String accountId;
   /**
   * Account ID that made the request
   * @return accountId
   **/
 
   @javax.annotation.Nonnull
 
   @ApiModelProperty(example = "fa9ea650fc7b31a89f92", required = true, value = "Account ID that made the request")
 
   public String getAccountId() {
       return accountId;
   }
 
 
 
   /**
    * The environment in which the mailpieces were created. Today, will only be &#x60;live&#x60;.
    */
   @JsonAdapter(ModeEnum.Adapter.class)
   public enum ModeEnum {
     TEST("test"),
 
     LIVE("live");
 
     private String value;
 
     ModeEnum(String value) {
       this.value = value;
     }
 
     public String getValue() {
       return value;
     }
 
     @Override
     public String toString() {
       return String.valueOf(value);
     }
 
     public static ModeEnum fromValue(String value) {
       for (ModeEnum b : ModeEnum.values()) {
         if (b.value.equals(value)) {
           return b;
         }
       }
       throw new IllegalArgumentException("Unexpected value '" + value + "'");
     }
 
     public static class Adapter extends TypeAdapter<ModeEnum> {
       @Override
       public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
         jsonWriter.value(enumeration.getValue());
       }
 
       @Override
       public ModeEnum read(final JsonReader jsonReader) throws IOException {
         String value =  jsonReader.nextString();
         return ModeEnum.fromValue(value);
       }
     }
   }
 
   public static final String SERIALIZED_NAME_MODE = "mode";
 
   @SerializedName(SERIALIZED_NAME_MODE)
 
 
   private ModeEnum mode;
   /**
   * The environment in which the mailpieces were created. Today, will only be `live`.
   * @return mode
   **/
 
   @javax.annotation.Nonnull
 
   @ApiModelProperty(required = true, value = "The environment in which the mailpieces were created. Today, will only be `live`.")
 
   public ModeEnum getMode() {
       return mode;
   }
 
 
 
   public static final String SERIALIZED_NAME_FAILURES_URL = "failuresUrl";
 
   @SerializedName(SERIALIZED_NAME_FAILURES_URL)
 
 
   private String failuresUrl;
   /**
   * Url where your campaign mailpiece failures can be retrieved
   * @return failuresUrl
   **/
 
   @javax.annotation.Nullable
 
   @ApiModelProperty(value = "Url where your campaign mailpiece failures can be retrieved")
 
   public String getFailuresUrl() {
       return failuresUrl;
   }
 
 
 
   public static final String SERIALIZED_NAME_ORIGINAL_FILENAME = "originalFilename";
 
   @SerializedName(SERIALIZED_NAME_ORIGINAL_FILENAME)
 
 
   private String originalFilename;
   /**
   * Filename of the upload
   * @return originalFilename
   **/
 
   @javax.annotation.Nullable
 
   @ApiModelProperty(value = "Filename of the upload")
 
   public String getOriginalFilename() {
       return originalFilename;
   }
 
 
 
   public static final String SERIALIZED_NAME_STATE = "state";
 
   @SerializedName(SERIALIZED_NAME_STATE)
 
 
   public static final String SERIALIZED_NAME_TOTAL_MAILPIECES = "totalMailpieces";
 
   @SerializedName(SERIALIZED_NAME_TOTAL_MAILPIECES)
 
 
   private Integer totalMailpieces;
   /**
   * Total number of recipients for the campaign
   * @return totalMailpieces
   **/
 
   @javax.annotation.Nonnull
 
   @ApiModelProperty(required = true, value = "Total number of recipients for the campaign")
 
   public Integer getTotalMailpieces() {
       return totalMailpieces;
   }
 
 
 
   public static final String SERIALIZED_NAME_FAILED_MAILPIECES = "failedMailpieces";
 
   @SerializedName(SERIALIZED_NAME_FAILED_MAILPIECES)
 
 
   private Integer failedMailpieces;
   /**
   * Number of mailpieces that failed to create
   * @return failedMailpieces
   **/
 
   @javax.annotation.Nonnull
 
   @ApiModelProperty(required = true, value = "Number of mailpieces that failed to create")
 
   public Integer getFailedMailpieces() {
       return failedMailpieces;
   }
 
 
 
   public static final String SERIALIZED_NAME_VALIDATED_MAILPIECES = "validatedMailpieces";
 
   @SerializedName(SERIALIZED_NAME_VALIDATED_MAILPIECES)
 
 
   private Integer validatedMailpieces;
   /**
   * Number of mailpieces that were successfully created
   * @return validatedMailpieces
   **/
 
   @javax.annotation.Nonnull
 
   @ApiModelProperty(required = true, value = "Number of mailpieces that were successfully created")
 
   public Integer getValidatedMailpieces() {
       return validatedMailpieces;
   }
 
 
 
   public static final String SERIALIZED_NAME_BYTES_PROCESSED = "bytesProcessed";
 
   @SerializedName(SERIALIZED_NAME_BYTES_PROCESSED)
 
 
   private Integer bytesProcessed;
   /**
   * Number of bytes processed in your CSV
   * @return bytesProcessed
   **/
 
   @javax.annotation.Nonnull
 
   @ApiModelProperty(required = true, value = "Number of bytes processed in your CSV")
 
   public Integer getBytesProcessed() {
       return bytesProcessed;
   }
 
 
 
   public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
 
   @SerializedName(SERIALIZED_NAME_DATE_CREATED)
 
 
   private OffsetDateTime dateCreated;
   /**
   * A timestamp in ISO 8601 format of the date the upload was created
   * @return dateCreated
   **/
 
   @javax.annotation.Nonnull
 
   @ApiModelProperty(required = true, value = "A timestamp in ISO 8601 format of the date the upload was created")
 
   public OffsetDateTime getDateCreated() {
       return dateCreated;
   }
 
 
 
   public static final String SERIALIZED_NAME_DATE_MODIFIED = "dateModified";
 
   @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
 
 
   private OffsetDateTime dateModified;
   /**
   * A timestamp in ISO 8601 format of the date the upload was last modified
   * @return dateModified
   **/
 
   @javax.annotation.Nonnull
 
   @ApiModelProperty(required = true, value = "A timestamp in ISO 8601 format of the date the upload was last modified")
 
   public OffsetDateTime getDateModified() {
       return dateModified;
   }
 
 
 
   public static final String SERIALIZED_NAME_REQUIRED_ADDRESS_COLUMN_MAPPING = "requiredAddressColumnMapping";
 
   @SerializedName(SERIALIZED_NAME_REQUIRED_ADDRESS_COLUMN_MAPPING)
 
 
   private RequiredAddressColumnMapping requiredAddressColumnMapping;
   /**
   * Get requiredAddressColumnMapping
   * @return requiredAddressColumnMapping
   **/
 
   @javax.annotation.Nonnull
 
   @ApiModelProperty(required = true, value = "")
 
   public RequiredAddressColumnMapping getRequiredAddressColumnMapping() {
       return requiredAddressColumnMapping;
   }
 
 
 
   public static final String SERIALIZED_NAME_OPTIONAL_ADDRESS_COLUMN_MAPPING = "optionalAddressColumnMapping";
 
   @SerializedName(SERIALIZED_NAME_OPTIONAL_ADDRESS_COLUMN_MAPPING)
 
 
   private OptionalAddressColumnMapping optionalAddressColumnMapping;
   /**
   * Get optionalAddressColumnMapping
   * @return optionalAddressColumnMapping
   **/
 
   @javax.annotation.Nonnull
 
   @ApiModelProperty(required = true, value = "")
 
   public OptionalAddressColumnMapping getOptionalAddressColumnMapping() {
       return optionalAddressColumnMapping;
   }
 
 
 
   public static final String SERIALIZED_NAME_METADATA = "metadata";
 
   @SerializedName(SERIALIZED_NAME_METADATA)
 
 
   private UploadsMetadata metadata = new UploadsMetadata();
   /**
   * Get metadata
   * @return metadata
   **/
 
   @javax.annotation.Nonnull
 
   @ApiModelProperty(required = true, value = "")
 
   public UploadsMetadata getMetadata() {
       return metadata;
   }
 
 
 
   public static final String SERIALIZED_NAME_MERGE_VARIABLE_COLUMN_MAPPING = "mergeVariableColumnMapping";
 
   @SerializedName(SERIALIZED_NAME_MERGE_VARIABLE_COLUMN_MAPPING)
 
 
   private Object mergeVariableColumnMapping;
   /**
   * The mapping of column headers in your file to the merge variables present in your creative. See our <a href=\"https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#step-3-map-merge-variable-data-if-applicable-7\" target=\"_blank\">Campaign Audience Guide</a> for additional details. <br />If a merge variable has the same \"name\" as a \"key\" in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects, then they **CANNOT** have a different value in this object. If a different value is provided, then when the campaign is processing it will get overwritten with the mapped value present in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects.
   * @return mergeVariableColumnMapping
   **/
 
   @javax.annotation.Nullable
 
   @ApiModelProperty(example = "{\"name\":\"recipient_name\",\"gift_code\":\"code\"}", required = true, value = "The mapping of column headers in your file to the merge variables present in your creative. See our <a href=\"https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#step-3-map-merge-variable-data-if-applicable-7\" target=\"_blank\">Campaign Audience Guide</a> for additional details. <br />If a merge variable has the same \"name\" as a \"key\" in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects, then they **CANNOT** have a different value in this object. If a different value is provided, then when the campaign is processing it will get overwritten with the mapped value present in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects.")
 
   public Object getMergeVariableColumnMapping() {
       return mergeVariableColumnMapping;
   }
 
 
 
 
   /*
   public Upload id(String id) {
 
     this.id = id;
     return this;
   }
   */
 
 
 
 
 
   /*
   public Upload accountId(String accountId) {
 
     this.accountId = accountId;
     return this;
   }
   */
 
 
   public void setAccountId(String accountId) {
     this.accountId = accountId;
   }
 
 
 
   /*
   public Upload mode(ModeEnum mode) {
 
     this.mode = mode;
     return this;
   }
   */
 
 
   public void setMode(ModeEnum mode) {
     this.mode = mode;
   }
 
 
 
   /*
   public Upload failuresUrl(String failuresUrl) {
 
     this.failuresUrl = failuresUrl;
     return this;
   }
   */
 
 
   public void setFailuresUrl(String failuresUrl) {
     this.failuresUrl = failuresUrl;
   }
 
 
 
   /*
   public Upload originalFilename(String originalFilename) {
 
     this.originalFilename = originalFilename;
     return this;
   }
   */
 
 
   public void setOriginalFilename(String originalFilename) {
     this.originalFilename = originalFilename;
   }
 
 
 
   /*
   public Upload state(UploadState state) {
 
     this.state = state;
     return this;
   }
   */
 
 
   /*
   public Upload totalMailpieces(Integer totalMailpieces) {
 
     this.totalMailpieces = totalMailpieces;
     return this;
   }
   */
 
 
   public void setTotalMailpieces(Integer totalMailpieces) {
     this.totalMailpieces = totalMailpieces;
   }
 
 
 
   /*
   public Upload failedMailpieces(Integer failedMailpieces) {
 
     this.failedMailpieces = failedMailpieces;
     return this;
   }
   */
 
 
   public void setFailedMailpieces(Integer failedMailpieces) {
     this.failedMailpieces = failedMailpieces;
   }
 
 
 
   /*
   public Upload validatedMailpieces(Integer validatedMailpieces) {
 
     this.validatedMailpieces = validatedMailpieces;
     return this;
   }
   */
 
 
   public void setValidatedMailpieces(Integer validatedMailpieces) {
     this.validatedMailpieces = validatedMailpieces;
   }
 
 
 
   /*
   public Upload bytesProcessed(Integer bytesProcessed) {
 
     this.bytesProcessed = bytesProcessed;
     return this;
   }
   */
 
 
   public void setBytesProcessed(Integer bytesProcessed) {
     this.bytesProcessed = bytesProcessed;
   }
 
 
 
   /*
   public Upload dateCreated(OffsetDateTime dateCreated) {
 
     this.dateCreated = dateCreated;
     return this;
   }
   */
 
 
   public void setDateCreated(OffsetDateTime dateCreated) {
     this.dateCreated = dateCreated;
   }
 
 
 
   /*
   public Upload dateModified(OffsetDateTime dateModified) {
 
     this.dateModified = dateModified;
     return this;
   }
   */
 
 
   public void setDateModified(OffsetDateTime dateModified) {
     this.dateModified = dateModified;
   }
 
 
 
   /*
   public Upload requiredAddressColumnMapping(RequiredAddressColumnMapping requiredAddressColumnMapping) {
 
     this.requiredAddressColumnMapping = requiredAddressColumnMapping;
     return this;
   }
   */
 
 
   public void setRequiredAddressColumnMapping(RequiredAddressColumnMapping requiredAddressColumnMapping) {
     this.requiredAddressColumnMapping = requiredAddressColumnMapping;
   }
 
 
 
   /*
   public Upload optionalAddressColumnMapping(OptionalAddressColumnMapping optionalAddressColumnMapping) {
 
     this.optionalAddressColumnMapping = optionalAddressColumnMapping;
     return this;
   }
   */
 
 
   public void setOptionalAddressColumnMapping(OptionalAddressColumnMapping optionalAddressColumnMapping) {
     this.optionalAddressColumnMapping = optionalAddressColumnMapping;
   }
 
 
 
   /*
   public Upload metadata(UploadsMetadata metadata) {
 
     this.metadata = metadata;
     return this;
   }
   */
 
 
   public void setMetadata(UploadsMetadata metadata) {
     this.metadata = metadata;
   }
 
 
 
   /*
   public Upload mergeVariableColumnMapping(Object mergeVariableColumnMapping) {
 
     this.mergeVariableColumnMapping = mergeVariableColumnMapping;
     return this;
   }
   */
 
 
   public void setMergeVariableColumnMapping(Object mergeVariableColumnMapping) {
     this.mergeVariableColumnMapping = mergeVariableColumnMapping;
   }
 
 
 
   @Override
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     Upload upload = (Upload) o;
     return Objects.equals(this.id, upload.id) &&
         Objects.equals(this.accountId, upload.accountId) &&
         Objects.equals(this.mode, upload.mode) &&
         Objects.equals(this.failuresUrl, upload.failuresUrl) &&
         Objects.equals(this.originalFilename, upload.originalFilename) &&
         Objects.equals(this.totalMailpieces, upload.totalMailpieces) &&
         Objects.equals(this.failedMailpieces, upload.failedMailpieces) &&
         Objects.equals(this.validatedMailpieces, upload.validatedMailpieces) &&
         Objects.equals(this.bytesProcessed, upload.bytesProcessed) &&
         Objects.equals(this.dateCreated, upload.dateCreated) &&
         Objects.equals(this.dateModified, upload.dateModified) &&
         Objects.equals(this.requiredAddressColumnMapping, upload.requiredAddressColumnMapping) &&
         Objects.equals(this.optionalAddressColumnMapping, upload.optionalAddressColumnMapping) &&
         Objects.equals(this.metadata, upload.metadata) &&
         Objects.equals(this.mergeVariableColumnMapping, upload.mergeVariableColumnMapping);
   }
 
   @Override
   public int hashCode() {
     return Objects.hash(id, accountId, mode, failuresUrl, originalFilename, totalMailpieces, failedMailpieces, validatedMailpieces, bytesProcessed, dateCreated, dateModified, requiredAddressColumnMapping, optionalAddressColumnMapping, metadata, mergeVariableColumnMapping);
   }
 
   @Override
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("{\n");
     sb.append("    id: ").append(toIndentedString(id)).append("\n");
     sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
     sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
     sb.append("    failuresUrl: ").append(toIndentedString(failuresUrl)).append("\n");
     sb.append("    originalFilename: ").append(toIndentedString(originalFilename)).append("\n");
     sb.append("    totalMailpieces: ").append(toIndentedString(totalMailpieces)).append("\n");
     sb.append("    failedMailpieces: ").append(toIndentedString(failedMailpieces)).append("\n");
     sb.append("    validatedMailpieces: ").append(toIndentedString(validatedMailpieces)).append("\n");
     sb.append("    bytesProcessed: ").append(toIndentedString(bytesProcessed)).append("\n");
     sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
     sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
     sb.append("    requiredAddressColumnMapping: ").append(toIndentedString(requiredAddressColumnMapping)).append("\n");
     sb.append("    optionalAddressColumnMapping: ").append(toIndentedString(optionalAddressColumnMapping)).append("\n");
     sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
     sb.append("    mergeVariableColumnMapping: ").append(toIndentedString(mergeVariableColumnMapping)).append("\n");
     sb.append("}");
     return sb.toString();
   }
 
   /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
   private String toIndentedString(Object o) {
     if (o == null) {
       return "null";
     }
     return o.toString().replace("\n", "\n    ");
   }
 
 }
 
 