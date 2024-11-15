// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gestorcorreogrpc.proto

package com;

/**
 * Protobuf type {@code com.Mail}
 */
public final class Mail extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.Mail)
    MailOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Mail.newBuilder() to construct.
  private Mail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Mail() {
    titulo_ = "";
    mensaje_ = "";
    remitente_ = "";
    destinatario_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Mail();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.Gestorcorreogrpc.internal_static_com_Mail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.Gestorcorreogrpc.internal_static_com_Mail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.Mail.class, com.Mail.Builder.class);
  }

  public static final int TITULO_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object titulo_ = "";
  /**
   * <code>string titulo = 1;</code>
   * @return The titulo.
   */
  @java.lang.Override
  public java.lang.String getTitulo() {
    java.lang.Object ref = titulo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      titulo_ = s;
      return s;
    }
  }
  /**
   * <code>string titulo = 1;</code>
   * @return The bytes for titulo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTituloBytes() {
    java.lang.Object ref = titulo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      titulo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MENSAJE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object mensaje_ = "";
  /**
   * <code>string mensaje = 2;</code>
   * @return The mensaje.
   */
  @java.lang.Override
  public java.lang.String getMensaje() {
    java.lang.Object ref = mensaje_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mensaje_ = s;
      return s;
    }
  }
  /**
   * <code>string mensaje = 2;</code>
   * @return The bytes for mensaje.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMensajeBytes() {
    java.lang.Object ref = mensaje_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mensaje_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REMITENTE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object remitente_ = "";
  /**
   * <code>string remitente = 3;</code>
   * @return The remitente.
   */
  @java.lang.Override
  public java.lang.String getRemitente() {
    java.lang.Object ref = remitente_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      remitente_ = s;
      return s;
    }
  }
  /**
   * <code>string remitente = 3;</code>
   * @return The bytes for remitente.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRemitenteBytes() {
    java.lang.Object ref = remitente_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      remitente_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESTINATARIO_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList destinatario_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string destinatario = 4;</code>
   * @return A list containing the destinatario.
   */
  public com.google.protobuf.ProtocolStringList
      getDestinatarioList() {
    return destinatario_;
  }
  /**
   * <code>repeated string destinatario = 4;</code>
   * @return The count of destinatario.
   */
  public int getDestinatarioCount() {
    return destinatario_.size();
  }
  /**
   * <code>repeated string destinatario = 4;</code>
   * @param index The index of the element to return.
   * @return The destinatario at the given index.
   */
  public java.lang.String getDestinatario(int index) {
    return destinatario_.get(index);
  }
  /**
   * <code>repeated string destinatario = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the destinatario at the given index.
   */
  public com.google.protobuf.ByteString
      getDestinatarioBytes(int index) {
    return destinatario_.getByteString(index);
  }

  public static final int ESFAVORITO_FIELD_NUMBER = 5;
  private boolean esFavorito_ = false;
  /**
   * <code>bool esFavorito = 5;</code>
   * @return The esFavorito.
   */
  @java.lang.Override
  public boolean getEsFavorito() {
    return esFavorito_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(titulo_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, titulo_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mensaje_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mensaje_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(remitente_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, remitente_);
    }
    for (int i = 0; i < destinatario_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, destinatario_.getRaw(i));
    }
    if (esFavorito_ != false) {
      output.writeBool(5, esFavorito_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(titulo_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, titulo_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mensaje_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mensaje_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(remitente_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, remitente_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < destinatario_.size(); i++) {
        dataSize += computeStringSizeNoTag(destinatario_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDestinatarioList().size();
    }
    if (esFavorito_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, esFavorito_);
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
    if (!(obj instanceof com.Mail)) {
      return super.equals(obj);
    }
    com.Mail other = (com.Mail) obj;

    if (!getTitulo()
        .equals(other.getTitulo())) return false;
    if (!getMensaje()
        .equals(other.getMensaje())) return false;
    if (!getRemitente()
        .equals(other.getRemitente())) return false;
    if (!getDestinatarioList()
        .equals(other.getDestinatarioList())) return false;
    if (getEsFavorito()
        != other.getEsFavorito()) return false;
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
    hash = (37 * hash) + TITULO_FIELD_NUMBER;
    hash = (53 * hash) + getTitulo().hashCode();
    hash = (37 * hash) + MENSAJE_FIELD_NUMBER;
    hash = (53 * hash) + getMensaje().hashCode();
    hash = (37 * hash) + REMITENTE_FIELD_NUMBER;
    hash = (53 * hash) + getRemitente().hashCode();
    if (getDestinatarioCount() > 0) {
      hash = (37 * hash) + DESTINATARIO_FIELD_NUMBER;
      hash = (53 * hash) + getDestinatarioList().hashCode();
    }
    hash = (37 * hash) + ESFAVORITO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEsFavorito());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.Mail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.Mail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.Mail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.Mail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.Mail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.Mail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.Mail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.Mail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.Mail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.Mail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.Mail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.Mail parseFrom(
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
  public static Builder newBuilder(com.Mail prototype) {
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
   * Protobuf type {@code com.Mail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.Mail)
      com.MailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.Gestorcorreogrpc.internal_static_com_Mail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.Gestorcorreogrpc.internal_static_com_Mail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.Mail.class, com.Mail.Builder.class);
    }

    // Construct using com.Mail.newBuilder()
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
      titulo_ = "";
      mensaje_ = "";
      remitente_ = "";
      destinatario_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      esFavorito_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.Gestorcorreogrpc.internal_static_com_Mail_descriptor;
    }

    @java.lang.Override
    public com.Mail getDefaultInstanceForType() {
      return com.Mail.getDefaultInstance();
    }

    @java.lang.Override
    public com.Mail build() {
      com.Mail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.Mail buildPartial() {
      com.Mail result = new com.Mail(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.Mail result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.titulo_ = titulo_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mensaje_ = mensaje_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.remitente_ = remitente_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        destinatario_.makeImmutable();
        result.destinatario_ = destinatario_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.esFavorito_ = esFavorito_;
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
      if (other instanceof com.Mail) {
        return mergeFrom((com.Mail)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.Mail other) {
      if (other == com.Mail.getDefaultInstance()) return this;
      if (!other.getTitulo().isEmpty()) {
        titulo_ = other.titulo_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getMensaje().isEmpty()) {
        mensaje_ = other.mensaje_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getRemitente().isEmpty()) {
        remitente_ = other.remitente_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.destinatario_.isEmpty()) {
        if (destinatario_.isEmpty()) {
          destinatario_ = other.destinatario_;
          bitField0_ |= 0x00000008;
        } else {
          ensureDestinatarioIsMutable();
          destinatario_.addAll(other.destinatario_);
        }
        onChanged();
      }
      if (other.getEsFavorito() != false) {
        setEsFavorito(other.getEsFavorito());
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
              titulo_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              mensaje_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              remitente_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureDestinatarioIsMutable();
              destinatario_.add(s);
              break;
            } // case 34
            case 40: {
              esFavorito_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private java.lang.Object titulo_ = "";
    /**
     * <code>string titulo = 1;</code>
     * @return The titulo.
     */
    public java.lang.String getTitulo() {
      java.lang.Object ref = titulo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        titulo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string titulo = 1;</code>
     * @return The bytes for titulo.
     */
    public com.google.protobuf.ByteString
        getTituloBytes() {
      java.lang.Object ref = titulo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        titulo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string titulo = 1;</code>
     * @param value The titulo to set.
     * @return This builder for chaining.
     */
    public Builder setTitulo(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      titulo_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string titulo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitulo() {
      titulo_ = getDefaultInstance().getTitulo();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string titulo = 1;</code>
     * @param value The bytes for titulo to set.
     * @return This builder for chaining.
     */
    public Builder setTituloBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      titulo_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object mensaje_ = "";
    /**
     * <code>string mensaje = 2;</code>
     * @return The mensaje.
     */
    public java.lang.String getMensaje() {
      java.lang.Object ref = mensaje_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mensaje_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mensaje = 2;</code>
     * @return The bytes for mensaje.
     */
    public com.google.protobuf.ByteString
        getMensajeBytes() {
      java.lang.Object ref = mensaje_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mensaje_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mensaje = 2;</code>
     * @param value The mensaje to set.
     * @return This builder for chaining.
     */
    public Builder setMensaje(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      mensaje_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string mensaje = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMensaje() {
      mensaje_ = getDefaultInstance().getMensaje();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string mensaje = 2;</code>
     * @param value The bytes for mensaje to set.
     * @return This builder for chaining.
     */
    public Builder setMensajeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      mensaje_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object remitente_ = "";
    /**
     * <code>string remitente = 3;</code>
     * @return The remitente.
     */
    public java.lang.String getRemitente() {
      java.lang.Object ref = remitente_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        remitente_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string remitente = 3;</code>
     * @return The bytes for remitente.
     */
    public com.google.protobuf.ByteString
        getRemitenteBytes() {
      java.lang.Object ref = remitente_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        remitente_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string remitente = 3;</code>
     * @param value The remitente to set.
     * @return This builder for chaining.
     */
    public Builder setRemitente(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      remitente_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string remitente = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRemitente() {
      remitente_ = getDefaultInstance().getRemitente();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string remitente = 3;</code>
     * @param value The bytes for remitente to set.
     * @return This builder for chaining.
     */
    public Builder setRemitenteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      remitente_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList destinatario_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureDestinatarioIsMutable() {
      if (!destinatario_.isModifiable()) {
        destinatario_ = new com.google.protobuf.LazyStringArrayList(destinatario_);
      }
      bitField0_ |= 0x00000008;
    }
    /**
     * <code>repeated string destinatario = 4;</code>
     * @return A list containing the destinatario.
     */
    public com.google.protobuf.ProtocolStringList
        getDestinatarioList() {
      destinatario_.makeImmutable();
      return destinatario_;
    }
    /**
     * <code>repeated string destinatario = 4;</code>
     * @return The count of destinatario.
     */
    public int getDestinatarioCount() {
      return destinatario_.size();
    }
    /**
     * <code>repeated string destinatario = 4;</code>
     * @param index The index of the element to return.
     * @return The destinatario at the given index.
     */
    public java.lang.String getDestinatario(int index) {
      return destinatario_.get(index);
    }
    /**
     * <code>repeated string destinatario = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the destinatario at the given index.
     */
    public com.google.protobuf.ByteString
        getDestinatarioBytes(int index) {
      return destinatario_.getByteString(index);
    }
    /**
     * <code>repeated string destinatario = 4;</code>
     * @param index The index to set the value at.
     * @param value The destinatario to set.
     * @return This builder for chaining.
     */
    public Builder setDestinatario(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDestinatarioIsMutable();
      destinatario_.set(index, value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string destinatario = 4;</code>
     * @param value The destinatario to add.
     * @return This builder for chaining.
     */
    public Builder addDestinatario(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDestinatarioIsMutable();
      destinatario_.add(value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string destinatario = 4;</code>
     * @param values The destinatario to add.
     * @return This builder for chaining.
     */
    public Builder addAllDestinatario(
        java.lang.Iterable<java.lang.String> values) {
      ensureDestinatarioIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, destinatario_);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string destinatario = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDestinatario() {
      destinatario_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string destinatario = 4;</code>
     * @param value The bytes of the destinatario to add.
     * @return This builder for chaining.
     */
    public Builder addDestinatarioBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureDestinatarioIsMutable();
      destinatario_.add(value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private boolean esFavorito_ ;
    /**
     * <code>bool esFavorito = 5;</code>
     * @return The esFavorito.
     */
    @java.lang.Override
    public boolean getEsFavorito() {
      return esFavorito_;
    }
    /**
     * <code>bool esFavorito = 5;</code>
     * @param value The esFavorito to set.
     * @return This builder for chaining.
     */
    public Builder setEsFavorito(boolean value) {

      esFavorito_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>bool esFavorito = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEsFavorito() {
      bitField0_ = (bitField0_ & ~0x00000010);
      esFavorito_ = false;
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


    // @@protoc_insertion_point(builder_scope:com.Mail)
  }

  // @@protoc_insertion_point(class_scope:com.Mail)
  private static final com.Mail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.Mail();
  }

  public static com.Mail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Mail>
      PARSER = new com.google.protobuf.AbstractParser<Mail>() {
    @java.lang.Override
    public Mail parsePartialFrom(
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

  public static com.google.protobuf.Parser<Mail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Mail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.Mail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

