package fi.metatavu.dcfb.server.rest.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ItemListSort
 */
public enum ItemListSort {
  
  CREATED_AT_DESC("CREATED_AT_DESC"),
  
  CREATED_AT_ASC("CREATED_AT_ASC"),
  
  MODIFIED_AT_DESC("MODIFIED_AT_DESC"),
  
  MODIFIED_AT_ASC("MODIFIED_AT_ASC"),
  
  SCORE_DESC("SCORE_DESC"),
  
  SCORE_ASC("SCORE_ASC");

  private String value;

  ItemListSort(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ItemListSort fromValue(String text) {
    for (ItemListSort b : ItemListSort.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


