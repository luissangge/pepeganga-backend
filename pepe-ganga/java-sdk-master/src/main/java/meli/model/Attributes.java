/*
 * MELI Markeplace SDK
 * This is a the codebase to generate a SDK for Open Platform Marketplace
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package meli.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import meli.model.AttributesValueStruct;
import meli.model.AttributesValues;

/**
 * Attributes
 */

public class Attributes {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE_ID = "value_id";
  @SerializedName(SERIALIZED_NAME_VALUE_ID)
  private String valueId;

  public static final String SERIALIZED_NAME_VALUE_NAME = "value_name";
  @SerializedName(SERIALIZED_NAME_VALUE_NAME)
  private String valueName;

  public static final String SERIALIZED_NAME_VALUE_STRUCT = "value_struct";
  @SerializedName(SERIALIZED_NAME_VALUE_STRUCT)
  private AttributesValueStruct valueStruct;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<AttributesValues> values = null;

  public static final String SERIALIZED_NAME_ATTRIBUTE_GROUP_ID = "attribute_group_id";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_GROUP_ID)
  private String attributeGroupId;

  public static final String SERIALIZED_NAME_ATTRIBUTE_GROUP_NAME = "attribute_group_name";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_GROUP_NAME)
  private String attributeGroupName;

  public Attributes id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DATA_STORAGE_CAPACITY", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Attributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Capacidad de almacenamiento de datos", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Attributes valueId(String valueId) {
    
    this.valueId = valueId;
    return this;
  }

   /**
   * Get valueId
   * @return valueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValueId() {
    return valueId;
  }


  public void setValueId(String valueId) {
    this.valueId = valueId;
  }


  public Attributes valueName(String valueName) {
    
    this.valueName = valueName;
    return this;
  }

   /**
   * Get valueName
   * @return valueName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8 GB", value = "")

  public String getValueName() {
    return valueName;
  }


  public void setValueName(String valueName) {
    this.valueName = valueName;
  }


  public Attributes valueStruct(AttributesValueStruct valueStruct) {
    
    this.valueStruct = valueStruct;
    return this;
  }

   /**
   * Get valueStruct
   * @return valueStruct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AttributesValueStruct getValueStruct() {
    return valueStruct;
  }


  public void setValueStruct(AttributesValueStruct valueStruct) {
    this.valueStruct = valueStruct;
  }


  public Attributes values(List<AttributesValues> values) {
    
    this.values = values;
    return this;
  }

  public Attributes addValuesItem(AttributesValues valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<AttributesValues>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AttributesValues> getValues() {
    return values;
  }


  public void setValues(List<AttributesValues> values) {
    this.values = values;
  }


  public Attributes attributeGroupId(String attributeGroupId) {
    
    this.attributeGroupId = attributeGroupId;
    return this;
  }

   /**
   * Get attributeGroupId
   * @return attributeGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OTHERS", value = "")

  public String getAttributeGroupId() {
    return attributeGroupId;
  }


  public void setAttributeGroupId(String attributeGroupId) {
    this.attributeGroupId = attributeGroupId;
  }


  public Attributes attributeGroupName(String attributeGroupName) {
    
    this.attributeGroupName = attributeGroupName;
    return this;
  }

   /**
   * Get attributeGroupName
   * @return attributeGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Otros", value = "")

  public String getAttributeGroupName() {
    return attributeGroupName;
  }


  public void setAttributeGroupName(String attributeGroupName) {
    this.attributeGroupName = attributeGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attributes attributes = (Attributes) o;
    return Objects.equals(this.id, attributes.id) &&
        Objects.equals(this.name, attributes.name) &&
        Objects.equals(this.valueId, attributes.valueId) &&
        Objects.equals(this.valueName, attributes.valueName) &&
        Objects.equals(this.valueStruct, attributes.valueStruct) &&
        Objects.equals(this.values, attributes.values) &&
        Objects.equals(this.attributeGroupId, attributes.attributeGroupId) &&
        Objects.equals(this.attributeGroupName, attributes.attributeGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, valueId, valueName, valueStruct, values, attributeGroupId, attributeGroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attributes {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    valueId: ").append(toIndentedString(valueId)).append("\n");
    sb.append("    valueName: ").append(toIndentedString(valueName)).append("\n");
    sb.append("    valueStruct: ").append(toIndentedString(valueStruct)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    attributeGroupId: ").append(toIndentedString(attributeGroupId)).append("\n");
    sb.append("    attributeGroupName: ").append(toIndentedString(attributeGroupName)).append("\n");
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

