/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ThriftGenerate;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.EncodingUtils;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;

public class Edge implements org.apache.thrift.TBase<Edge, Edge._Fields>, java.io.Serializable, Cloneable, Comparable<Edge> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Edge");

  private static final org.apache.thrift.protocol.TField NAME_EDGE_FIELD_DESC = new org.apache.thrift.protocol.TField("nameEdge", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ID_EDGE_FIELD_DESC = new org.apache.thrift.protocol.TField("idEdge", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField ID_VERTEX1_FIELD_DESC = new org.apache.thrift.protocol.TField("idVertex1", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField ID_VERTEX2_FIELD_DESC = new org.apache.thrift.protocol.TField("idVertex2", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField FLAG_DIRECTED_FIELD_DESC = new org.apache.thrift.protocol.TField("flagDirected", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField WEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("weight", org.apache.thrift.protocol.TType.DOUBLE, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EdgeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EdgeTupleSchemeFactory());
  }

  public String nameEdge; // required
  public int idEdge; // required
  public int version; // required
  public int idVertex1; // required
  public int idVertex2; // required
  public boolean flagDirected; // required
  public String description; // required
  public double weight; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME_EDGE((short)1, "nameEdge"),
    ID_EDGE((short)2, "idEdge"),
    VERSION((short)3, "version"),
    ID_VERTEX1((short)4, "idVertex1"),
    ID_VERTEX2((short)5, "idVertex2"),
    FLAG_DIRECTED((short)6, "flagDirected"),
    DESCRIPTION((short)7, "description"),
    WEIGHT((short)8, "weight");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME_EDGE
          return NAME_EDGE;
        case 2: // ID_EDGE
          return ID_EDGE;
        case 3: // VERSION
          return VERSION;
        case 4: // ID_VERTEX1
          return ID_VERTEX1;
        case 5: // ID_VERTEX2
          return ID_VERTEX2;
        case 6: // FLAG_DIRECTED
          return FLAG_DIRECTED;
        case 7: // DESCRIPTION
          return DESCRIPTION;
        case 8: // WEIGHT
          return WEIGHT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __IDEDGE_ISSET_ID = 0;
  private static final int __VERSION_ISSET_ID = 1;
  private static final int __IDVERTEX1_ISSET_ID = 2;
  private static final int __IDVERTEX2_ISSET_ID = 3;
  private static final int __FLAGDIRECTED_ISSET_ID = 4;
  private static final int __WEIGHT_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME_EDGE, new org.apache.thrift.meta_data.FieldMetaData("nameEdge", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ID_EDGE, new org.apache.thrift.meta_data.FieldMetaData("idEdge", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ID_VERTEX1, new org.apache.thrift.meta_data.FieldMetaData("idVertex1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ID_VERTEX2, new org.apache.thrift.meta_data.FieldMetaData("idVertex2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FLAG_DIRECTED, new org.apache.thrift.meta_data.FieldMetaData("flagDirected", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WEIGHT, new org.apache.thrift.meta_data.FieldMetaData("weight", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Edge.class, metaDataMap);
  }

  public Edge() {
  }

  public Edge(
    String nameEdge,
    int idEdge,
    int version,
    int idVertex1,
    int idVertex2,
    boolean flagDirected,
    String description,
    double weight)
  {
    this();
    this.nameEdge = nameEdge;
    this.idEdge = idEdge;
    setIdEdgeIsSet(true);
    this.version = version;
    setVersionIsSet(true);
    this.idVertex1 = idVertex1;
    setIdVertex1IsSet(true);
    this.idVertex2 = idVertex2;
    setIdVertex2IsSet(true);
    this.flagDirected = flagDirected;
    setFlagDirectedIsSet(true);
    this.description = description;
    this.weight = weight;
    setWeightIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Edge(Edge other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetNameEdge()) {
      this.nameEdge = other.nameEdge;
    }
    this.idEdge = other.idEdge;
    this.version = other.version;
    this.idVertex1 = other.idVertex1;
    this.idVertex2 = other.idVertex2;
    this.flagDirected = other.flagDirected;
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    this.weight = other.weight;
  }

  public Edge deepCopy() {
    return new Edge(this);
  }

  @Override
  public void clear() {
    this.nameEdge = null;
    setIdEdgeIsSet(false);
    this.idEdge = 0;
    setVersionIsSet(false);
    this.version = 0;
    setIdVertex1IsSet(false);
    this.idVertex1 = 0;
    setIdVertex2IsSet(false);
    this.idVertex2 = 0;
    setFlagDirectedIsSet(false);
    this.flagDirected = false;
    this.description = null;
    setWeightIsSet(false);
    this.weight = 0.0;
  }

  public String getNameEdge() {
    return this.nameEdge;
  }

  public Edge setNameEdge(String nameEdge) {
    this.nameEdge = nameEdge;
    return this;
  }

  public void unsetNameEdge() {
    this.nameEdge = null;
  }

  /** Returns true if field nameEdge is set (has been assigned a value) and false otherwise */
  public boolean isSetNameEdge() {
    return this.nameEdge != null;
  }

  public void setNameEdgeIsSet(boolean value) {
    if (!value) {
      this.nameEdge = null;
    }
  }

  public int getIdEdge() {
    return this.idEdge;
  }

  public Edge setIdEdge(int idEdge) {
    this.idEdge = idEdge;
    setIdEdgeIsSet(true);
    return this;
  }

  public void unsetIdEdge() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IDEDGE_ISSET_ID);
  }

  /** Returns true if field idEdge is set (has been assigned a value) and false otherwise */
  public boolean isSetIdEdge() {
    return EncodingUtils.testBit(__isset_bitfield, __IDEDGE_ISSET_ID);
  }

  public void setIdEdgeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IDEDGE_ISSET_ID, value);
  }

  public int getVersion() {
    return this.version;
  }

  public Edge setVersion(int version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public int getIdVertex1() {
    return this.idVertex1;
  }

  public Edge setIdVertex1(int idVertex1) {
    this.idVertex1 = idVertex1;
    setIdVertex1IsSet(true);
    return this;
  }

  public void unsetIdVertex1() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IDVERTEX1_ISSET_ID);
  }

  /** Returns true if field idVertex1 is set (has been assigned a value) and false otherwise */
  public boolean isSetIdVertex1() {
    return EncodingUtils.testBit(__isset_bitfield, __IDVERTEX1_ISSET_ID);
  }

  public void setIdVertex1IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IDVERTEX1_ISSET_ID, value);
  }

  public int getIdVertex2() {
    return this.idVertex2;
  }

  public Edge setIdVertex2(int idVertex2) {
    this.idVertex2 = idVertex2;
    setIdVertex2IsSet(true);
    return this;
  }

  public void unsetIdVertex2() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IDVERTEX2_ISSET_ID);
  }

  /** Returns true if field idVertex2 is set (has been assigned a value) and false otherwise */
  public boolean isSetIdVertex2() {
    return EncodingUtils.testBit(__isset_bitfield, __IDVERTEX2_ISSET_ID);
  }

  public void setIdVertex2IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IDVERTEX2_ISSET_ID, value);
  }

  public boolean isFlagDirected() {
    return this.flagDirected;
  }

  public Edge setFlagDirected(boolean flagDirected) {
    this.flagDirected = flagDirected;
    setFlagDirectedIsSet(true);
    return this;
  }

  public void unsetFlagDirected() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FLAGDIRECTED_ISSET_ID);
  }

  /** Returns true if field flagDirected is set (has been assigned a value) and false otherwise */
  public boolean isSetFlagDirected() {
    return EncodingUtils.testBit(__isset_bitfield, __FLAGDIRECTED_ISSET_ID);
  }

  public void setFlagDirectedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FLAGDIRECTED_ISSET_ID, value);
  }

  public String getDescription() {
    return this.description;
  }

  public Edge setDescription(String description) {
    this.description = description;
    return this;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  public double getWeight() {
    return this.weight;
  }

  public Edge setWeight(double weight) {
    this.weight = weight;
    setWeightIsSet(true);
    return this;
  }

  public void unsetWeight() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  /** Returns true if field weight is set (has been assigned a value) and false otherwise */
  public boolean isSetWeight() {
    return EncodingUtils.testBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  public void setWeightIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WEIGHT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME_EDGE:
      if (value == null) {
        unsetNameEdge();
      } else {
        setNameEdge((String)value);
      }
      break;

    case ID_EDGE:
      if (value == null) {
        unsetIdEdge();
      } else {
        setIdEdge((Integer)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Integer)value);
      }
      break;

    case ID_VERTEX1:
      if (value == null) {
        unsetIdVertex1();
      } else {
        setIdVertex1((Integer)value);
      }
      break;

    case ID_VERTEX2:
      if (value == null) {
        unsetIdVertex2();
      } else {
        setIdVertex2((Integer)value);
      }
      break;

    case FLAG_DIRECTED:
      if (value == null) {
        unsetFlagDirected();
      } else {
        setFlagDirected((Boolean)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((String)value);
      }
      break;

    case WEIGHT:
      if (value == null) {
        unsetWeight();
      } else {
        setWeight((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME_EDGE:
      return getNameEdge();

    case ID_EDGE:
      return Integer.valueOf(getIdEdge());

    case VERSION:
      return Integer.valueOf(getVersion());

    case ID_VERTEX1:
      return Integer.valueOf(getIdVertex1());

    case ID_VERTEX2:
      return Integer.valueOf(getIdVertex2());

    case FLAG_DIRECTED:
      return Boolean.valueOf(isFlagDirected());

    case DESCRIPTION:
      return getDescription();

    case WEIGHT:
      return Double.valueOf(getWeight());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME_EDGE:
      return isSetNameEdge();
    case ID_EDGE:
      return isSetIdEdge();
    case VERSION:
      return isSetVersion();
    case ID_VERTEX1:
      return isSetIdVertex1();
    case ID_VERTEX2:
      return isSetIdVertex2();
    case FLAG_DIRECTED:
      return isSetFlagDirected();
    case DESCRIPTION:
      return isSetDescription();
    case WEIGHT:
      return isSetWeight();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Edge)
      return this.equals((Edge)that);
    return false;
  }

  public boolean equals(Edge that) {
    if (that == null)
      return false;

    boolean this_present_nameEdge = true && this.isSetNameEdge();
    boolean that_present_nameEdge = true && that.isSetNameEdge();
    if (this_present_nameEdge || that_present_nameEdge) {
      if (!(this_present_nameEdge && that_present_nameEdge))
        return false;
      if (!this.nameEdge.equals(that.nameEdge))
        return false;
    }

    boolean this_present_idEdge = true;
    boolean that_present_idEdge = true;
    if (this_present_idEdge || that_present_idEdge) {
      if (!(this_present_idEdge && that_present_idEdge))
        return false;
      if (this.idEdge != that.idEdge)
        return false;
    }

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_idVertex1 = true;
    boolean that_present_idVertex1 = true;
    if (this_present_idVertex1 || that_present_idVertex1) {
      if (!(this_present_idVertex1 && that_present_idVertex1))
        return false;
      if (this.idVertex1 != that.idVertex1)
        return false;
    }

    boolean this_present_idVertex2 = true;
    boolean that_present_idVertex2 = true;
    if (this_present_idVertex2 || that_present_idVertex2) {
      if (!(this_present_idVertex2 && that_present_idVertex2))
        return false;
      if (this.idVertex2 != that.idVertex2)
        return false;
    }

    boolean this_present_flagDirected = true;
    boolean that_present_flagDirected = true;
    if (this_present_flagDirected || that_present_flagDirected) {
      if (!(this_present_flagDirected && that_present_flagDirected))
        return false;
      if (this.flagDirected != that.flagDirected)
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    boolean this_present_weight = true;
    boolean that_present_weight = true;
    if (this_present_weight || that_present_weight) {
      if (!(this_present_weight && that_present_weight))
        return false;
      if (this.weight != that.weight)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Edge other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNameEdge()).compareTo(other.isSetNameEdge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNameEdge()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nameEdge, other.nameEdge);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIdEdge()).compareTo(other.isSetIdEdge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdEdge()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idEdge, other.idEdge);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIdVertex1()).compareTo(other.isSetIdVertex1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdVertex1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idVertex1, other.idVertex1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIdVertex2()).compareTo(other.isSetIdVertex2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdVertex2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idVertex2, other.idVertex2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFlagDirected()).compareTo(other.isSetFlagDirected());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFlagDirected()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.flagDirected, other.flagDirected);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWeight()).compareTo(other.isSetWeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWeight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.weight, other.weight);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Edge(");
    boolean first = true;

    sb.append("nameEdge:");
    if (this.nameEdge == null) {
      sb.append("null");
    } else {
      sb.append(this.nameEdge);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("idEdge:");
    sb.append(this.idEdge);
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("idVertex1:");
    sb.append(this.idVertex1);
    first = false;
    if (!first) sb.append(", ");
    sb.append("idVertex2:");
    sb.append(this.idVertex2);
    first = false;
    if (!first) sb.append(", ");
    sb.append("flagDirected:");
    sb.append(this.flagDirected);
    first = false;
    if (!first) sb.append(", ");
    sb.append("description:");
    if (this.description == null) {
      sb.append("null");
    } else {
      sb.append(this.description);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("weight:");
    sb.append(this.weight);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EdgeStandardSchemeFactory implements SchemeFactory {
    public EdgeStandardScheme getScheme() {
      return new EdgeStandardScheme();
    }
  }

  private static class EdgeStandardScheme extends StandardScheme<Edge> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Edge struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME_EDGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nameEdge = iprot.readString();
              struct.setNameEdgeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ID_EDGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.idEdge = iprot.readI32();
              struct.setIdEdgeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.version = iprot.readI32();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ID_VERTEX1
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.idVertex1 = iprot.readI32();
              struct.setIdVertex1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ID_VERTEX2
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.idVertex2 = iprot.readI32();
              struct.setIdVertex2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // FLAG_DIRECTED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.flagDirected = iprot.readBool();
              struct.setFlagDirectedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // WEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.weight = iprot.readDouble();
              struct.setWeightIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Edge struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nameEdge != null) {
        oprot.writeFieldBegin(NAME_EDGE_FIELD_DESC);
        oprot.writeString(struct.nameEdge);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ID_EDGE_FIELD_DESC);
      oprot.writeI32(struct.idEdge);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI32(struct.version);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ID_VERTEX1_FIELD_DESC);
      oprot.writeI32(struct.idVertex1);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ID_VERTEX2_FIELD_DESC);
      oprot.writeI32(struct.idVertex2);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FLAG_DIRECTED_FIELD_DESC);
      oprot.writeBool(struct.flagDirected);
      oprot.writeFieldEnd();
      if (struct.description != null) {
        oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
        oprot.writeString(struct.description);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(WEIGHT_FIELD_DESC);
      oprot.writeDouble(struct.weight);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EdgeTupleSchemeFactory implements SchemeFactory {
    public EdgeTupleScheme getScheme() {
      return new EdgeTupleScheme();
    }
  }

  private static class EdgeTupleScheme extends TupleScheme<Edge> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Edge struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNameEdge()) {
        optionals.set(0);
      }
      if (struct.isSetIdEdge()) {
        optionals.set(1);
      }
      if (struct.isSetVersion()) {
        optionals.set(2);
      }
      if (struct.isSetIdVertex1()) {
        optionals.set(3);
      }
      if (struct.isSetIdVertex2()) {
        optionals.set(4);
      }
      if (struct.isSetFlagDirected()) {
        optionals.set(5);
      }
      if (struct.isSetDescription()) {
        optionals.set(6);
      }
      if (struct.isSetWeight()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetNameEdge()) {
        oprot.writeString(struct.nameEdge);
      }
      if (struct.isSetIdEdge()) {
        oprot.writeI32(struct.idEdge);
      }
      if (struct.isSetVersion()) {
        oprot.writeI32(struct.version);
      }
      if (struct.isSetIdVertex1()) {
        oprot.writeI32(struct.idVertex1);
      }
      if (struct.isSetIdVertex2()) {
        oprot.writeI32(struct.idVertex2);
      }
      if (struct.isSetFlagDirected()) {
        oprot.writeBool(struct.flagDirected);
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
      if (struct.isSetWeight()) {
        oprot.writeDouble(struct.weight);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Edge struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.nameEdge = iprot.readString();
        struct.setNameEdgeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.idEdge = iprot.readI32();
        struct.setIdEdgeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.version = iprot.readI32();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.idVertex1 = iprot.readI32();
        struct.setIdVertex1IsSet(true);
      }
      if (incoming.get(4)) {
        struct.idVertex2 = iprot.readI32();
        struct.setIdVertex2IsSet(true);
      }
      if (incoming.get(5)) {
        struct.flagDirected = iprot.readBool();
        struct.setFlagDirectedIsSet(true);
      }
      if (incoming.get(6)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
      if (incoming.get(7)) {
        struct.weight = iprot.readDouble();
        struct.setWeightIsSet(true);
      }
    }
  }

}

