// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gestorcorreogrpc.proto

package com;

/**
 * <pre>
 * Representación de un usuario en el sistema
 * </pre>
 *
 * Protobuf type {@code com.Usuario}
 */
public final class Usuario extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.Usuario)
    UsuarioOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Usuario.newBuilder() to construct.
  private Usuario(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Usuario() {
    nombre_ = "";
    apellido_ = "";
    direccionCorreo_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Usuario();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.Gestorcorreogrpc.internal_static_com_Usuario_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.Gestorcorreogrpc.internal_static_com_Usuario_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.Usuario.class, com.Usuario.Builder.class);
  }

  public static final int NOMBRE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nombre_ = "";
  /**
   * <code>string nombre = 1;</code>
   * @return The nombre.
   */
  @java.lang.Override
  public java.lang.String getNombre() {
    java.lang.Object ref = nombre_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nombre_ = s;
      return s;
    }
  }
  /**
   * <code>string nombre = 1;</code>
   * @return The bytes for nombre.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNombreBytes() {
    java.lang.Object ref = nombre_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nombre_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APELLIDO_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object apellido_ = "";
  /**
   * <code>string apellido = 2;</code>
   * @return The apellido.
   */
  @java.lang.Override
  public java.lang.String getApellido() {
    java.lang.Object ref = apellido_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      apellido_ = s;
      return s;
    }
  }
  /**
   * <code>string apellido = 2;</code>
   * @return The bytes for apellido.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getApellidoBytes() {
    java.lang.Object ref = apellido_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      apellido_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIRECCIONCORREO_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object direccionCorreo_ = "";
  /**
   * <code>string direccionCorreo = 3;</code>
   * @return The direccionCorreo.
   */
  @java.lang.Override
  public java.lang.String getDireccionCorreo() {
    java.lang.Object ref = direccionCorreo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      direccionCorreo_ = s;
      return s;
    }
  }
  /**
   * <code>string direccionCorreo = 3;</code>
   * @return The bytes for direccionCorreo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDireccionCorreoBytes() {
    java.lang.Object ref = direccionCorreo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      direccionCorreo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nombre_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nombre_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(apellido_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, apellido_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(direccionCorreo_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, direccionCorreo_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nombre_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nombre_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(apellido_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, apellido_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(direccionCorreo_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, direccionCorreo_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.Usuario)) {
      return super.equals(obj);
    }
    com.Usuario other = (com.Usuario) obj;

    if (!getNombre()
        .equals(other.getNombre())) return false;
    if (!getApellido()
        .equals(other.getApellido())) return false;
    if (!getDireccionCorreo()
        .equals(other.getDireccionCorreo())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NOMBRE_FIELD_NUMBER;
    hash = (53 * hash) + getNombre().hashCode();
    hash = (37 * hash) + APELLIDO_FIELD_NUMBER;
    hash = (53 * hash) + getApellido().hashCode();
    hash = (37 * hash) + DIRECCIONCORREO_FIELD_NUMBER;
    hash = (53 * hash) + getDireccionCorreo().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.Usuario parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.Usuario parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.Usuario parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.Usuario parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.Usuario parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.Usuario parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.Usuario parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.Usuario parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.Usuario parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.Usuario parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.Usuario parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.Usuario parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.Usuario prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Representación de un usuario en el sistema
   * </pre>
   *
   * Protobuf type {@code com.Usuario}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.Usuario)
      com.UsuarioOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.Gestorcorreogrpc.internal_static_com_Usuario_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.Gestorcorreogrpc.internal_static_com_Usuario_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.Usuario.class, com.Usuario.Builder.class);
    }

    // Construct using com.Usuario.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      nombre_ = "";
      apellido_ = "";
      direccionCorreo_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.Gestorcorreogrpc.internal_static_com_Usuario_descriptor;
    }

    @java.lang.Override
    public com.Usuario getDefaultInstanceForType() {
      return com.Usuario.getDefaultInstance();
    }

    @java.lang.Override
    public com.Usuario build() {
      com.Usuario result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.Usuario buildPartial() {
      com.Usuario result = new com.Usuario(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.Usuario result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nombre_ = nombre_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.apellido_ = apellido_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.direccionCorreo_ = direccionCorreo_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.Usuario) {
        return mergeFrom((com.Usuario)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.Usuario other) {
      if (other == com.Usuario.getDefaultInstance()) return this;
      if (!other.getNombre().isEmpty()) {
        nombre_ = other.nombre_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getApellido().isEmpty()) {
        apellido_ = other.apellido_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDireccionCorreo().isEmpty()) {
        direccionCorreo_ = other.direccionCorreo_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              nombre_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              apellido_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              direccionCorreo_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object nombre_ = "";
    /**
     * <code>string nombre = 1;</code>
     * @return The nombre.
     */
    public java.lang.String getNombre() {
      java.lang.Object ref = nombre_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nombre_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nombre = 1;</code>
     * @return The bytes for nombre.
     */
    public com.google.protobuf.ByteString
        getNombreBytes() {
      java.lang.Object ref = nombre_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nombre_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nombre = 1;</code>
     * @param value The nombre to set.
     * @return This builder for chaining.
     */
    public Builder setNombre(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nombre_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string nombre = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNombre() {
      nombre_ = getDefaultInstance().getNombre();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string nombre = 1;</code>
     * @param value The bytes for nombre to set.
     * @return This builder for chaining.
     */
    public Builder setNombreBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nombre_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object apellido_ = "";
    /**
     * <code>string apellido = 2;</code>
     * @return The apellido.
     */
    public java.lang.String getApellido() {
      java.lang.Object ref = apellido_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        apellido_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string apellido = 2;</code>
     * @return The bytes for apellido.
     */
    public com.google.protobuf.ByteString
        getApellidoBytes() {
      java.lang.Object ref = apellido_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        apellido_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string apellido = 2;</code>
     * @param value The apellido to set.
     * @return This builder for chaining.
     */
    public Builder setApellido(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      apellido_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string apellido = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearApellido() {
      apellido_ = getDefaultInstance().getApellido();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string apellido = 2;</code>
     * @param value The bytes for apellido to set.
     * @return This builder for chaining.
     */
    public Builder setApellidoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      apellido_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object direccionCorreo_ = "";
    /**
     * <code>string direccionCorreo = 3;</code>
     * @return The direccionCorreo.
     */
    public java.lang.String getDireccionCorreo() {
      java.lang.Object ref = direccionCorreo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        direccionCorreo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string direccionCorreo = 3;</code>
     * @return The bytes for direccionCorreo.
     */
    public com.google.protobuf.ByteString
        getDireccionCorreoBytes() {
      java.lang.Object ref = direccionCorreo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        direccionCorreo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string direccionCorreo = 3;</code>
     * @param value The direccionCorreo to set.
     * @return This builder for chaining.
     */
    public Builder setDireccionCorreo(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      direccionCorreo_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string direccionCorreo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDireccionCorreo() {
      direccionCorreo_ = getDefaultInstance().getDireccionCorreo();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string direccionCorreo = 3;</code>
     * @param value The bytes for direccionCorreo to set.
     * @return This builder for chaining.
     */
    public Builder setDireccionCorreoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      direccionCorreo_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.Usuario)
  }

  // @@protoc_insertion_point(class_scope:com.Usuario)
  private static final com.Usuario DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.Usuario();
  }

  public static com.Usuario getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Usuario>
      PARSER = new com.google.protobuf.AbstractParser<Usuario>() {
    @java.lang.Override
    public Usuario parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Usuario> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Usuario> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.Usuario getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
