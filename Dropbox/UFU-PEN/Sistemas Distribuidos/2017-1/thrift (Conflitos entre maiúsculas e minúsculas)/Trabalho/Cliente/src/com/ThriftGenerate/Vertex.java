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

public class Vertex implements org.apache.thrift.TBase<Vertex, Vertex._Fields>, java.io.Serializable, Cloneable, Comparable<Vertex> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Vertex");

  private static final org.apache.thrift.protocol.TField NAME_VERTEX_FIELD_DESC = new org.apache.thrift.protocol.TField("nameVertex", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ID_VERTEX_FIELD_DESC = new org.apache.thrift.protocol.TField("idVertex", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField ID_EDGE1_FIELD_DESC = new org.apache.thrift.protocol.TField("idEdge1", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField ID_EDGE2_FIELD_DESC = new org.apache.thrift.protocol.TField("idEdge2", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField COLOR_FIELD_DESC = new org.apache.thrift.protocol.TField("color", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField WEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("weight", org.apache.thrift.protocol.TType.DOUBLE, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new VertexStandardSchemeFactory());
    schemes.put(TupleScheme.class, new VertexTupleSchemeFactory());
  }

  public String nameVertex; // required
  public int idVertex; // required
  public int version; // required
  public int idEdge1; // required
  public int idEdge2; // required
  public String color; // required
  public String description; // required
  public double weight; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME_VERTEX((short)1, "nameVertex"),
    ID_VERTEX((short)2, "idVertex"),
    VERSION((short)3, "version"),
    ID_EDGE1((short)4, "idEdge1"),
    ID_EDGE2((short)5, "idEdge2"),
    COLOR((short)6, "color"),
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
        case 1: // NAME_VERTEX
          return NAME_VERTEX;
        case 2: // ID_VERTEX
          return ID_VERTEX;
        case 3: // VERSION
          return VERSION;
        case 4: // ID_EDGE1
          return ID_EDGE1;
        case 5: // ID_EDGE2
          return ID_EDGE2;
        case 6: // COLOR
          return COLOR;
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
  private static final int __IDVERTEX_ISSET_ID = 0;
  private static final int __VERSION_ISSET_ID = 1;
  private static final int __IDEDGE1_ISSET_ID = 2;
  private static final int __IDEDGE2_ISSET_ID = 3;
  private static final int __WEIGHT_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME_VERTEX, new org.apache.thrift.meta_data.FieldMetaData("nameVertex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ID_VERTEX, new org.apache.thrift.meta_data.FieldMetaData("idVertex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ID_EDGE1, new org.apache.thrift.meta_data.FieldMetaData("idEdge1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ID_EDGE2, new org.apache.thrift.meta_data.FieldMetaData("idEdge2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COLOR, new org.apache.thrift.meta_data.FieldMetaData("color", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WEIGHT, new org.apache.thrift.meta_data.FieldMetaData("weight", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Vertex.class, metaDataMap);
  }

  public Vertex() {
  }

  public Vertex(
    String nameVertex,
    int idVertex,
    int version,
    int idEdge1,
    int idEdge2,
    String color,
    String description,
    double weight)
  {
    this();
    this.nameVertex = nameVertex;
    this.idVertex = idVertex;
    setIdVertexIsSet(true);
    this.version = version;
    setVersionIsSet(true);
    this.idEdge1 = idEdge1;
    setIdEdge1IsSet(true);
    this.idEdge2 = idEdge2;
    setIdEdge2IsSet(true);
    this.color = color;
    this.description = description;
    this.weight = weight;
    setWeightIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Vertex(Vertex other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetNameVertex()) {
      this.nameVertex = other.nameVertex;
    }
    this.idVertex = other.idVertex;
    this.version = other.version;
    this.idEdge1 = other.idEdge1;
    this.idEdge2 = other.idEdge2;
    if (other.isSetColor()) {
      this.color = other.color;
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    this.weight = other.weight;
  }

  public Vertex deepCopy() {
    return new Vertex(this);
  }

  @Override
  public void clear() {
    this.nameVertex = null;
    setIdVertexIsSet(false);
    this.idVertex = 0;
    setVersionIsSet(false);
    this.version = 0;
    setIdEdge1IsSet(false);
    this.idEdge1 = 0;
    setIdEdge2IsSet(false);
    this.idEdge2 = 0;
    this.color = null;
    this.description = null;
    setWeightIsSet(false);
    this.weight = 0.0;
  }

  public String getNameVertex() {
    return this.nameVertex;
  }

  public Vertex setNameVertex(String nameVertex) {
    this.nameVertex = nameVertex;
    return this;
  }

  public void unsetNameVertex() {
    this.nameVertex = null;
  }

  /** Returns true if field nameVertex is set (has been assigned a value) and false otherwise */
  public boolean isSetNameVertex() {
    return this.nameVertex != null;
  }

  public void setNameVertexIsSet(boolean value) {
    if (!value) {
      this.nameVertex = null;
    }
  }

  public int getIdVertex() {
    return this.idVertex;
  }

  public Vertex setIdVertex(int idVertex) {
    this.idVertex = idVertex;
    setIdVertexIsSet(true);
    return this;
  }

  public void unsetIdVertex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IDVERTEX_ISSET_ID);
  }

  /** Returns true if field idVertex is set (has been assigned a value) and false otherwise */
  public boolean isSetIdVertex() {
    return EncodingUtils.testBit(__isset_bitfield, __IDVERTEX_ISSET_ID);
  }

  public void setIdVertexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IDVERTEX_ISSET_ID, value);
  }

  public int getVersion() {
    return this.version;
  }

  public Vertex setVersion(int version) {
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

  public int getIdEdge1() {
    return this.idEdge1;
  }

  public Vertex setIdEdge1(int idEdge1) {
    this.idEdge1 = idEdge1;
    setIdEdge1IsSet(true);
    return this;
  }

  public void unsetIdEdge1() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IDEDGE1_ISSET_ID);
  }

  /** Returns true if field idEdge1 is set (has been assigned a value) and false otherwise */
  public boolean isSetIdEdge1() {
    return EncodingUtils.testBit(__isset_bitfield, __IDEDGE1_ISSET_ID);
  }

  public void setIdEdge1IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IDEDGE1_ISSET_ID, value);
  }

  public int getIdEdge2() {
    return this.idEdge2;
  }

  public Vertex setIdEdge2(int idEdge2) {
    this.idEdge2 = idEdge2;
    setIdEdge2IsSet(true);
    return this;
  }

  public void unsetIdEdge2() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IDEDGE2_ISSET_ID);
  }

  /** Returns true if field idEdge2 is set (has been assigned a value) and false otherwise */
  public boolean isSetIdEdge2() {
    return EncodingUtils.testBit(__isset_bitfield, __IDEDGE2_ISSET_ID);
  }

  public void setIdEdge2IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IDEDGE2_ISSET_ID, value);
  }

  public String getColor() {
    return this.color;
  }

  public Vertex setColor(String color) {
    this.color = color;
    return this;
  }

  public void unsetColor() {
    this.color = null;
  }

  /** Returns true if field color is set (has been assigned a value) and false otherwise */
  public boolean isSetColor() {
    return this.color != null;
  }

  public void setColorIsSet(boolean value) {
    if (!value) {
      this.color = null;
    }
  }

  public String getDescription() {
    return this.description;
  }

  public Vertex setDescription(String description) {
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

  public Vertex setWeight(double weight) {
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
    case NAME_VERTEX:
      if (value == null) {
        unsetNameVertex();
      } else {
        setNameVertex((String)value);
      }
      break;

    case ID_VERTEX:
      if (value == null) {
        unsetIdVertex();
      } else {
        setIdVertex((Integer)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Integer)value);
      }
      break;

    case ID_EDGE1:
      if (value == null) {
        unsetIdEdge1();
      } else {
        setIdEdge1((Integer)value);
      }
      break;

    case ID_EDGE2:
      if (value == null) {
        unsetIdEdge2();
      } else {
        setIdEdge2((Integer)value);
      }
      break;

    case COLOR:
      if (value == null) {
        unsetColor();
      } else {
        setColor((String)value);
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
    case NAME_VERTEX:
      return getNameVertex();

    case ID_VERTEX:
      return Integer.valueOf(getIdVertex());

    case VERSION:
      return Integer.valueOf(getVersion());

    case ID_EDGE1:
      return Integer.valueOf(getIdEdge1());

    case ID_EDGE2:
      return Integer.valueOf(getIdEdge2());

    case COLOR:
      return getColor();

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
    case NAME_VERTEX:
      return isSetNameVertex();
    case ID_VERTEX:
      return isSetIdVertex();
    case VERSION:
      return isSetVersion();
    case ID_EDGE1:
      return isSetIdEdge1();
    case ID_EDGE2:
      return isSetIdEdge2();
    case COLOR:
      return isSetColor();
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
    if (that instanceof Vertex)
      return this.equals((Vertex)that);
    return false;
  }

  public boolean equals(Vertex that) {
    if (that == null)
      return false;

    boolean this_present_nameVertex = true && this.isSetNameVertex();
    boolean that_present_nameVertex = true && that.isSetNameVertex();
    if (this_present_nameVertex || that_present_nameVertex) {
      if (!(this_present_nameVertex && that_present_nameVertex))
        return false;
      if (!this.nameVertex.equals(that.nameVertex))
        return false;
    }

    boolean this_present_idVertex = true;
    boolean that_present_idVertex = true;
    if (this_present_idVertex || that_present_idVertex) {
      if (!(this_present_idVertex && that_present_idVertex))
        return false;
      if (this.idVertex != that.idVertex)
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

    boolean this_present_idEdge1 = true;
    boolean that_present_idEdge1 = true;
    if (this_present_idEdge1 || that_present_idEdge1) {
      if (!(this_present_idEdge1 && that_present_idEdge1))
        return false;
      if (this.idEdge1 != that.idEdge1)
        return false;
    }

    boolean this_present_idEdge2 = true;
    boolean that_present_idEdge2 = true;
    if (this_present_idEdge2 || that_present_idEdge2) {
      if (!(this_present_idEdge2 && that_present_idEdge2))
        return false;
      if (this.idEdge2 != that.idEdge2)
        return false;
    }

    boolean this_present_color = true && this.isSetColor();
    boolean that_present_color = true && that.isSetColor();
    if (this_present_color || that_present_color) {
      if (!(this_present_color && that_present_color))
        return false;
      if (!this.color.equals(that.color))
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
  public int compareTo(Vertex other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNameVertex()).compareTo(other.isSetNameVertex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNameVertex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nameVertex, other.nameVertex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIdVertex()).compareTo(other.isSetIdVertex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdVertex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idVertex, other.idVertex);
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
    lastComparison = Boolean.valueOf(isSetIdEdge1()).compareTo(other.isSetIdEdge1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdEdge1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idEdge1, other.idEdge1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIdEdge2()).compareTo(other.isSetIdEdge2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdEdge2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idEdge2, other.idEdge2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColor()).compareTo(other.isSetColor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.color, other.color);
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
    StringBuilder sb = new StringBuilder("Vertex(");
    boolean first = true;

    sb.append("nameVertex:");
    if (this.nameVertex == null) {
      sb.append("null");
    } else {
      sb.append(this.nameVertex);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("idVertex:");
    sb.append(this.idVertex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("idEdge1:");
    sb.append(this.idEdge1);
    first = false;
    if (!first) sb.append(", ");
    sb.append("idEdge2:");
    sb.append(this.idEdge2);
    first = false;
    if (!first) sb.append(", ");
    sb.append("color:");
    if (this.color == null) {
      sb.append("null");
    } else {
      sb.append(this.color);
    }
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

  private static class VertexStandardSchemeFactory implements SchemeFactory {
    public VertexStandardScheme getScheme() {
      return new VertexStandardScheme();
    }
  }

  private static class VertexStandardScheme extends StandardScheme<Vertex> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Vertex struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME_VERTEX
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nameVertex = iprot.readString();
              struct.setNameVertexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ID_VERTEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.idVertex = iprot.readI32();
              struct.setIdVertexIsSet(true);
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
          case 4: // ID_EDGE1
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.idEdge1 = iprot.readI32();
              struct.setIdEdge1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ID_EDGE2
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.idEdge2 = iprot.readI32();
              struct.setIdEdge2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // COLOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.color = iprot.readString();
              struct.setColorIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Vertex struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nameVertex != null) {
        oprot.writeFieldBegin(NAME_VERTEX_FIELD_DESC);
        oprot.writeString(struct.nameVertex);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ID_VERTEX_FIELD_DESC);
      oprot.writeI32(struct.idVertex);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI32(struct.version);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ID_EDGE1_FIELD_DESC);
      oprot.writeI32(struct.idEdge1);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ID_EDGE2_FIELD_DESC);
      oprot.writeI32(struct.idEdge2);
      oprot.writeFieldEnd();
      if (struct.color != null) {
        oprot.writeFieldBegin(COLOR_FIELD_DESC);
        oprot.writeString(struct.color);
        oprot.writeFieldEnd();
      }
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

  private static class VertexTupleSchemeFactory implements SchemeFactory {
    public VertexTupleScheme getScheme() {
      return new VertexTupleScheme();
    }
  }

  private static class VertexTupleScheme extends TupleScheme<Vertex> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Vertex struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNameVertex()) {
        optionals.set(0);
      }
      if (struct.isSetIdVertex()) {
        optionals.set(1);
      }
      if (struct.isSetVersion()) {
        optionals.set(2);
      }
      if (struct.isSetIdEdge1()) {
        optionals.set(3);
      }
      if (struct.isSetIdEdge2()) {
        optionals.set(4);
      }
      if (struct.isSetColor()) {
        optionals.set(5);
      }
      if (struct.isSetDescription()) {
        optionals.set(6);
      }
      if (struct.isSetWeight()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetNameVertex()) {
        oprot.writeString(struct.nameVertex);
      }
      if (struct.isSetIdVertex()) {
        oprot.writeI32(struct.idVertex);
      }
      if (struct.isSetVersion()) {
        oprot.writeI32(struct.version);
      }
      if (struct.isSetIdEdge1()) {
        oprot.writeI32(struct.idEdge1);
      }
      if (struct.isSetIdEdge2()) {
        oprot.writeI32(struct.idEdge2);
      }
      if (struct.isSetColor()) {
        oprot.writeString(struct.color);
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
      if (struct.isSetWeight()) {
        oprot.writeDouble(struct.weight);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Vertex struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.nameVertex = iprot.readString();
        struct.setNameVertexIsSet(true);
      }
      if (incoming.get(1)) {
        struct.idVertex = iprot.readI32();
        struct.setIdVertexIsSet(true);
      }
      if (incoming.get(2)) {
        struct.version = iprot.readI32();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.idEdge1 = iprot.readI32();
        struct.setIdEdge1IsSet(true);
      }
      if (incoming.get(4)) {
        struct.idEdge2 = iprot.readI32();
        struct.setIdEdge2IsSet(true);
      }
      if (incoming.get(5)) {
        struct.color = iprot.readString();
        struct.setColorIsSet(true);
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

