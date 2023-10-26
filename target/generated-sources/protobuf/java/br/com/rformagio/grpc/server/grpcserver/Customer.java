// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomerService.proto

package br.com.rformagio.grpc.server.grpcserver;

/**
 * Protobuf type {@code br.com.rformagio.grpc.server.grpcserver.Customer}
 */
public  final class Customer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:br.com.rformagio.grpc.server.grpcserver.Customer)
    CustomerOrBuilder {
  // Use Customer.newBuilder() to construct.
  private Customer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Customer() {
    customerId_ = "";
    firstName_ = "";
    lastName_ = "";
    email_ = "";
    phoneNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    age_ = 0;
    balance_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Customer(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            customerId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            firstName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            lastName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            email_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              phoneNumbers_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000010;
            }
            phoneNumbers_.add(s);
            break;
          }
          case 48: {

            age_ = input.readInt32();
            break;
          }
          case 57: {

            balance_ = input.readDouble();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        phoneNumbers_ = phoneNumbers_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.rformagio.grpc.server.grpcserver.CustomerServiceOuterClass.internal_static_br_com_rformagio_grpc_server_grpcserver_Customer_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.rformagio.grpc.server.grpcserver.CustomerServiceOuterClass.internal_static_br_com_rformagio_grpc_server_grpcserver_Customer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.rformagio.grpc.server.grpcserver.Customer.class, br.com.rformagio.grpc.server.grpcserver.Customer.Builder.class);
  }

  private int bitField0_;
  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object customerId_;
  /**
   * <code>string customer_id = 1;</code>
   */
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <code>string customer_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIRST_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object firstName_;
  /**
   * <code>string first_name = 2;</code>
   */
  public java.lang.String getFirstName() {
    java.lang.Object ref = firstName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      firstName_ = s;
      return s;
    }
  }
  /**
   * <code>string first_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFirstNameBytes() {
    java.lang.Object ref = firstName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      firstName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAST_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object lastName_;
  /**
   * <code>string last_name = 3;</code>
   */
  public java.lang.String getLastName() {
    java.lang.Object ref = lastName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lastName_ = s;
      return s;
    }
  }
  /**
   * <code>string last_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getLastNameBytes() {
    java.lang.Object ref = lastName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lastName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 4;
  private volatile java.lang.Object email_;
  /**
   * <code>string email = 4;</code>
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>string email = 4;</code>
   */
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHONE_NUMBERS_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList phoneNumbers_;
  /**
   * <code>repeated string phone_numbers = 5;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getPhoneNumbersList() {
    return phoneNumbers_;
  }
  /**
   * <code>repeated string phone_numbers = 5;</code>
   */
  public int getPhoneNumbersCount() {
    return phoneNumbers_.size();
  }
  /**
   * <code>repeated string phone_numbers = 5;</code>
   */
  public java.lang.String getPhoneNumbers(int index) {
    return phoneNumbers_.get(index);
  }
  /**
   * <code>repeated string phone_numbers = 5;</code>
   */
  public com.google.protobuf.ByteString
      getPhoneNumbersBytes(int index) {
    return phoneNumbers_.getByteString(index);
  }

  public static final int AGE_FIELD_NUMBER = 6;
  private int age_;
  /**
   * <pre>
   * Add an age field of type int32
   * </pre>
   *
   * <code>int32 age = 6;</code>
   */
  public int getAge() {
    return age_;
  }

  public static final int BALANCE_FIELD_NUMBER = 7;
  private double balance_;
  /**
   * <pre>
   * Add a balance field of type double
   * </pre>
   *
   * <code>double balance = 7;</code>
   */
  public double getBalance() {
    return balance_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getCustomerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    if (!getFirstNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, firstName_);
    }
    if (!getLastNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lastName_);
    }
    if (!getEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, email_);
    }
    for (int i = 0; i < phoneNumbers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, phoneNumbers_.getRaw(i));
    }
    if (age_ != 0) {
      output.writeInt32(6, age_);
    }
    if (balance_ != 0D) {
      output.writeDouble(7, balance_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCustomerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    if (!getFirstNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, firstName_);
    }
    if (!getLastNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lastName_);
    }
    if (!getEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, email_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < phoneNumbers_.size(); i++) {
        dataSize += computeStringSizeNoTag(phoneNumbers_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPhoneNumbersList().size();
    }
    if (age_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, age_);
    }
    if (balance_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, balance_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof br.com.rformagio.grpc.server.grpcserver.Customer)) {
      return super.equals(obj);
    }
    br.com.rformagio.grpc.server.grpcserver.Customer other = (br.com.rformagio.grpc.server.grpcserver.Customer) obj;

    boolean result = true;
    result = result && getCustomerId()
        .equals(other.getCustomerId());
    result = result && getFirstName()
        .equals(other.getFirstName());
    result = result && getLastName()
        .equals(other.getLastName());
    result = result && getEmail()
        .equals(other.getEmail());
    result = result && getPhoneNumbersList()
        .equals(other.getPhoneNumbersList());
    result = result && (getAge()
        == other.getAge());
    result = result && (
        java.lang.Double.doubleToLongBits(getBalance())
        == java.lang.Double.doubleToLongBits(
            other.getBalance()));
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    hash = (37 * hash) + FIRST_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFirstName().hashCode();
    hash = (37 * hash) + LAST_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getLastName().hashCode();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    if (getPhoneNumbersCount() > 0) {
      hash = (37 * hash) + PHONE_NUMBERS_FIELD_NUMBER;
      hash = (53 * hash) + getPhoneNumbersList().hashCode();
    }
    hash = (37 * hash) + AGE_FIELD_NUMBER;
    hash = (53 * hash) + getAge();
    hash = (37 * hash) + BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBalance()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.rformagio.grpc.server.grpcserver.Customer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.rformagio.grpc.server.grpcserver.Customer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.rformagio.grpc.server.grpcserver.Customer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.rformagio.grpc.server.grpcserver.Customer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.rformagio.grpc.server.grpcserver.Customer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.rformagio.grpc.server.grpcserver.Customer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.rformagio.grpc.server.grpcserver.Customer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.rformagio.grpc.server.grpcserver.Customer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.rformagio.grpc.server.grpcserver.Customer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.rformagio.grpc.server.grpcserver.Customer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.rformagio.grpc.server.grpcserver.Customer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.rformagio.grpc.server.grpcserver.Customer parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(br.com.rformagio.grpc.server.grpcserver.Customer prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code br.com.rformagio.grpc.server.grpcserver.Customer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:br.com.rformagio.grpc.server.grpcserver.Customer)
      br.com.rformagio.grpc.server.grpcserver.CustomerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.rformagio.grpc.server.grpcserver.CustomerServiceOuterClass.internal_static_br_com_rformagio_grpc_server_grpcserver_Customer_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.rformagio.grpc.server.grpcserver.CustomerServiceOuterClass.internal_static_br_com_rformagio_grpc_server_grpcserver_Customer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.rformagio.grpc.server.grpcserver.Customer.class, br.com.rformagio.grpc.server.grpcserver.Customer.Builder.class);
    }

    // Construct using br.com.rformagio.grpc.server.grpcserver.Customer.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      customerId_ = "";

      firstName_ = "";

      lastName_ = "";

      email_ = "";

      phoneNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      age_ = 0;

      balance_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.rformagio.grpc.server.grpcserver.CustomerServiceOuterClass.internal_static_br_com_rformagio_grpc_server_grpcserver_Customer_descriptor;
    }

    public br.com.rformagio.grpc.server.grpcserver.Customer getDefaultInstanceForType() {
      return br.com.rformagio.grpc.server.grpcserver.Customer.getDefaultInstance();
    }

    public br.com.rformagio.grpc.server.grpcserver.Customer build() {
      br.com.rformagio.grpc.server.grpcserver.Customer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public br.com.rformagio.grpc.server.grpcserver.Customer buildPartial() {
      br.com.rformagio.grpc.server.grpcserver.Customer result = new br.com.rformagio.grpc.server.grpcserver.Customer(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.customerId_ = customerId_;
      result.firstName_ = firstName_;
      result.lastName_ = lastName_;
      result.email_ = email_;
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        phoneNumbers_ = phoneNumbers_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.phoneNumbers_ = phoneNumbers_;
      result.age_ = age_;
      result.balance_ = balance_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof br.com.rformagio.grpc.server.grpcserver.Customer) {
        return mergeFrom((br.com.rformagio.grpc.server.grpcserver.Customer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.rformagio.grpc.server.grpcserver.Customer other) {
      if (other == br.com.rformagio.grpc.server.grpcserver.Customer.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        onChanged();
      }
      if (!other.getFirstName().isEmpty()) {
        firstName_ = other.firstName_;
        onChanged();
      }
      if (!other.getLastName().isEmpty()) {
        lastName_ = other.lastName_;
        onChanged();
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        onChanged();
      }
      if (!other.phoneNumbers_.isEmpty()) {
        if (phoneNumbers_.isEmpty()) {
          phoneNumbers_ = other.phoneNumbers_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensurePhoneNumbersIsMutable();
          phoneNumbers_.addAll(other.phoneNumbers_);
        }
        onChanged();
      }
      if (other.getAge() != 0) {
        setAge(other.getAge());
      }
      if (other.getBalance() != 0D) {
        setBalance(other.getBalance());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      br.com.rformagio.grpc.server.grpcserver.Customer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.rformagio.grpc.server.grpcserver.Customer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object customerId_ = "";
    /**
     * <code>string customer_id = 1;</code>
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string customer_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string customer_id = 1;</code>
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string customer_id = 1;</code>
     */
    public Builder clearCustomerId() {
      
      customerId_ = getDefaultInstance().getCustomerId();
      onChanged();
      return this;
    }
    /**
     * <code>string customer_id = 1;</code>
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object firstName_ = "";
    /**
     * <code>string first_name = 2;</code>
     */
    public java.lang.String getFirstName() {
      java.lang.Object ref = firstName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string first_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFirstNameBytes() {
      java.lang.Object ref = firstName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string first_name = 2;</code>
     */
    public Builder setFirstName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      firstName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string first_name = 2;</code>
     */
    public Builder clearFirstName() {
      
      firstName_ = getDefaultInstance().getFirstName();
      onChanged();
      return this;
    }
    /**
     * <code>string first_name = 2;</code>
     */
    public Builder setFirstNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      firstName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object lastName_ = "";
    /**
     * <code>string last_name = 3;</code>
     */
    public java.lang.String getLastName() {
      java.lang.Object ref = lastName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string last_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLastNameBytes() {
      java.lang.Object ref = lastName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string last_name = 3;</code>
     */
    public Builder setLastName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lastName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string last_name = 3;</code>
     */
    public Builder clearLastName() {
      
      lastName_ = getDefaultInstance().getLastName();
      onChanged();
      return this;
    }
    /**
     * <code>string last_name = 3;</code>
     */
    public Builder setLastNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lastName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     * <code>string email = 4;</code>
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email = 4;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email = 4;</code>
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      email_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string email = 4;</code>
     */
    public Builder clearEmail() {
      
      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string email = 4;</code>
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      email_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList phoneNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePhoneNumbersIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        phoneNumbers_ = new com.google.protobuf.LazyStringArrayList(phoneNumbers_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <code>repeated string phone_numbers = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getPhoneNumbersList() {
      return phoneNumbers_.getUnmodifiableView();
    }
    /**
     * <code>repeated string phone_numbers = 5;</code>
     */
    public int getPhoneNumbersCount() {
      return phoneNumbers_.size();
    }
    /**
     * <code>repeated string phone_numbers = 5;</code>
     */
    public java.lang.String getPhoneNumbers(int index) {
      return phoneNumbers_.get(index);
    }
    /**
     * <code>repeated string phone_numbers = 5;</code>
     */
    public com.google.protobuf.ByteString
        getPhoneNumbersBytes(int index) {
      return phoneNumbers_.getByteString(index);
    }
    /**
     * <code>repeated string phone_numbers = 5;</code>
     */
    public Builder setPhoneNumbers(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePhoneNumbersIsMutable();
      phoneNumbers_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string phone_numbers = 5;</code>
     */
    public Builder addPhoneNumbers(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePhoneNumbersIsMutable();
      phoneNumbers_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string phone_numbers = 5;</code>
     */
    public Builder addAllPhoneNumbers(
        java.lang.Iterable<java.lang.String> values) {
      ensurePhoneNumbersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, phoneNumbers_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string phone_numbers = 5;</code>
     */
    public Builder clearPhoneNumbers() {
      phoneNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string phone_numbers = 5;</code>
     */
    public Builder addPhoneNumbersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePhoneNumbersIsMutable();
      phoneNumbers_.add(value);
      onChanged();
      return this;
    }

    private int age_ ;
    /**
     * <pre>
     * Add an age field of type int32
     * </pre>
     *
     * <code>int32 age = 6;</code>
     */
    public int getAge() {
      return age_;
    }
    /**
     * <pre>
     * Add an age field of type int32
     * </pre>
     *
     * <code>int32 age = 6;</code>
     */
    public Builder setAge(int value) {
      
      age_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Add an age field of type int32
     * </pre>
     *
     * <code>int32 age = 6;</code>
     */
    public Builder clearAge() {
      
      age_ = 0;
      onChanged();
      return this;
    }

    private double balance_ ;
    /**
     * <pre>
     * Add a balance field of type double
     * </pre>
     *
     * <code>double balance = 7;</code>
     */
    public double getBalance() {
      return balance_;
    }
    /**
     * <pre>
     * Add a balance field of type double
     * </pre>
     *
     * <code>double balance = 7;</code>
     */
    public Builder setBalance(double value) {
      
      balance_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Add a balance field of type double
     * </pre>
     *
     * <code>double balance = 7;</code>
     */
    public Builder clearBalance() {
      
      balance_ = 0D;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:br.com.rformagio.grpc.server.grpcserver.Customer)
  }

  // @@protoc_insertion_point(class_scope:br.com.rformagio.grpc.server.grpcserver.Customer)
  private static final br.com.rformagio.grpc.server.grpcserver.Customer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.rformagio.grpc.server.grpcserver.Customer();
  }

  public static br.com.rformagio.grpc.server.grpcserver.Customer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Customer>
      PARSER = new com.google.protobuf.AbstractParser<Customer>() {
    public Customer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Customer(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Customer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Customer> getParserForType() {
    return PARSER;
  }

  public br.com.rformagio.grpc.server.grpcserver.Customer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

