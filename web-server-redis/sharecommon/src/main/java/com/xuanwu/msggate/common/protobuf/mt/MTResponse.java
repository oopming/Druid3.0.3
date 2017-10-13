// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MTResponse.proto

package com.xuanwu.msggate.common.protobuf.mt;

public final class MTResponse {
  private MTResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .com.xuanwu.msggate.common.protobuf.Result result = 1;
    boolean hasResult();
    com.xuanwu.msggate.common.protobuf.CommonItem.Result getResult();
    
    // optional .com.xuanwu.msggate.common.protobuf.UUID uuid = 2;
    boolean hasUuid();
    com.xuanwu.msggate.common.protobuf.CommonItem.UUID getUuid();
    com.xuanwu.msggate.common.protobuf.CommonItem.UUIDOrBuilder getUuidOrBuilder();
    
    // optional string message = 3;
    boolean hasMessage();
    String getMessage();
    
    // optional string attributes = 4;
    boolean hasAttributes();
    String getAttributes();
  }
  public static final class TResponse extends
      com.google.protobuf.GeneratedMessage
      implements TResponseOrBuilder {
    // Use TResponse.newBuilder() to construct.
    private TResponse(Builder builder) {
      super(builder);
    }
    private TResponse(boolean noInit) {}
    
    private static final TResponse defaultInstance;
    public static TResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public TResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xuanwu.msggate.common.protobuf.mt.MTResponse.internal_static_com_xuanwu_msggate_common_protobuf_mt_TResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xuanwu.msggate.common.protobuf.mt.MTResponse.internal_static_com_xuanwu_msggate_common_protobuf_mt_TResponse_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required .com.xuanwu.msggate.common.protobuf.Result result = 1;
    public static final int RESULT_FIELD_NUMBER = 1;
    private com.xuanwu.msggate.common.protobuf.CommonItem.Result result_;
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.xuanwu.msggate.common.protobuf.CommonItem.Result getResult() {
      return result_;
    }
    
    // optional .com.xuanwu.msggate.common.protobuf.UUID uuid = 2;
    public static final int UUID_FIELD_NUMBER = 2;
    private com.xuanwu.msggate.common.protobuf.CommonItem.UUID uuid_;
    public boolean hasUuid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.xuanwu.msggate.common.protobuf.CommonItem.UUID getUuid() {
      return uuid_;
    }
    public com.xuanwu.msggate.common.protobuf.CommonItem.UUIDOrBuilder getUuidOrBuilder() {
      return uuid_;
    }
    
    // optional string message = 3;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    private java.lang.Object message_;
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          message_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string attributes = 4;
    public static final int ATTRIBUTES_FIELD_NUMBER = 4;
    private java.lang.Object attributes_;
    public boolean hasAttributes() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getAttributes() {
      java.lang.Object ref = attributes_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          attributes_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getAttributesBytes() {
      java.lang.Object ref = attributes_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        attributes_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      result_ = com.xuanwu.msggate.common.protobuf.CommonItem.Result.SUCCESS;
      uuid_ = com.xuanwu.msggate.common.protobuf.CommonItem.UUID.getDefaultInstance();
      message_ = "";
      attributes_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasResult()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasUuid()) {
        if (!getUuid().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, result_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, uuid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getMessageBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getAttributesBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, result_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, uuid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMessageBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getAttributesBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xuanwu.msggate.common.protobuf.mt.MTResponse.internal_static_com_xuanwu_msggate_common_protobuf_mt_TResponse_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xuanwu.msggate.common.protobuf.mt.MTResponse.internal_static_com_xuanwu_msggate_common_protobuf_mt_TResponse_fieldAccessorTable;
      }
      
      // Construct using com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getUuidFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        result_ = com.xuanwu.msggate.common.protobuf.CommonItem.Result.SUCCESS;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (uuidBuilder_ == null) {
          uuid_ = com.xuanwu.msggate.common.protobuf.CommonItem.UUID.getDefaultInstance();
        } else {
          uuidBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        attributes_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse.getDescriptor();
      }
      
      public com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse getDefaultInstanceForType() {
        return com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse.getDefaultInstance();
      }
      
      public com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse build() {
        com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse buildPartial() {
        com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse result = new com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.result_ = result_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (uuidBuilder_ == null) {
          result.uuid_ = uuid_;
        } else {
          result.uuid_ = uuidBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.message_ = message_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.attributes_ = attributes_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse) {
          return mergeFrom((com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse other) {
        if (other == com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse.getDefaultInstance()) return this;
        if (other.hasResult()) {
          setResult(other.getResult());
        }
        if (other.hasUuid()) {
          mergeUuid(other.getUuid());
        }
        if (other.hasMessage()) {
          setMessage(other.getMessage());
        }
        if (other.hasAttributes()) {
          setAttributes(other.getAttributes());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasResult()) {
          
          return false;
        }
        if (hasUuid()) {
          if (!getUuid().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              com.xuanwu.msggate.common.protobuf.CommonItem.Result value = com.xuanwu.msggate.common.protobuf.CommonItem.Result.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                result_ = value;
              }
              break;
            }
            case 18: {
              com.xuanwu.msggate.common.protobuf.CommonItem.UUID.Builder subBuilder = com.xuanwu.msggate.common.protobuf.CommonItem.UUID.newBuilder();
              if (hasUuid()) {
                subBuilder.mergeFrom(getUuid());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setUuid(subBuilder.buildPartial());
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              message_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              attributes_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .com.xuanwu.msggate.common.protobuf.Result result = 1;
      private com.xuanwu.msggate.common.protobuf.CommonItem.Result result_ = com.xuanwu.msggate.common.protobuf.CommonItem.Result.SUCCESS;
      public boolean hasResult() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.xuanwu.msggate.common.protobuf.CommonItem.Result getResult() {
        return result_;
      }
      public Builder setResult(com.xuanwu.msggate.common.protobuf.CommonItem.Result value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        result_ = value;
        onChanged();
        return this;
      }
      public Builder clearResult() {
        bitField0_ = (bitField0_ & ~0x00000001);
        result_ = com.xuanwu.msggate.common.protobuf.CommonItem.Result.SUCCESS;
        onChanged();
        return this;
      }
      
      // optional .com.xuanwu.msggate.common.protobuf.UUID uuid = 2;
      private com.xuanwu.msggate.common.protobuf.CommonItem.UUID uuid_ = com.xuanwu.msggate.common.protobuf.CommonItem.UUID.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.xuanwu.msggate.common.protobuf.CommonItem.UUID, com.xuanwu.msggate.common.protobuf.CommonItem.UUID.Builder, com.xuanwu.msggate.common.protobuf.CommonItem.UUIDOrBuilder> uuidBuilder_;
      public boolean hasUuid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.xuanwu.msggate.common.protobuf.CommonItem.UUID getUuid() {
        if (uuidBuilder_ == null) {
          return uuid_;
        } else {
          return uuidBuilder_.getMessage();
        }
      }
      public Builder setUuid(com.xuanwu.msggate.common.protobuf.CommonItem.UUID value) {
        if (uuidBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          uuid_ = value;
          onChanged();
        } else {
          uuidBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder setUuid(
          com.xuanwu.msggate.common.protobuf.CommonItem.UUID.Builder builderForValue) {
        if (uuidBuilder_ == null) {
          uuid_ = builderForValue.build();
          onChanged();
        } else {
          uuidBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder mergeUuid(com.xuanwu.msggate.common.protobuf.CommonItem.UUID value) {
        if (uuidBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              uuid_ != com.xuanwu.msggate.common.protobuf.CommonItem.UUID.getDefaultInstance()) {
            uuid_ =
              com.xuanwu.msggate.common.protobuf.CommonItem.UUID.newBuilder(uuid_).mergeFrom(value).buildPartial();
          } else {
            uuid_ = value;
          }
          onChanged();
        } else {
          uuidBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder clearUuid() {
        if (uuidBuilder_ == null) {
          uuid_ = com.xuanwu.msggate.common.protobuf.CommonItem.UUID.getDefaultInstance();
          onChanged();
        } else {
          uuidBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      public com.xuanwu.msggate.common.protobuf.CommonItem.UUID.Builder getUuidBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getUuidFieldBuilder().getBuilder();
      }
      public com.xuanwu.msggate.common.protobuf.CommonItem.UUIDOrBuilder getUuidOrBuilder() {
        if (uuidBuilder_ != null) {
          return uuidBuilder_.getMessageOrBuilder();
        } else {
          return uuid_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.xuanwu.msggate.common.protobuf.CommonItem.UUID, com.xuanwu.msggate.common.protobuf.CommonItem.UUID.Builder, com.xuanwu.msggate.common.protobuf.CommonItem.UUIDOrBuilder> 
          getUuidFieldBuilder() {
        if (uuidBuilder_ == null) {
          uuidBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.xuanwu.msggate.common.protobuf.CommonItem.UUID, com.xuanwu.msggate.common.protobuf.CommonItem.UUID.Builder, com.xuanwu.msggate.common.protobuf.CommonItem.UUIDOrBuilder>(
                  uuid_,
                  getParentForChildren(),
                  isClean());
          uuid_ = null;
        }
        return uuidBuilder_;
      }
      
      // optional string message = 3;
      private java.lang.Object message_ = "";
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setMessage(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000004);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      void setMessage(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
      }
      
      // optional string attributes = 4;
      private java.lang.Object attributes_ = "";
      public boolean hasAttributes() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getAttributes() {
        java.lang.Object ref = attributes_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          attributes_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setAttributes(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        attributes_ = value;
        onChanged();
        return this;
      }
      public Builder clearAttributes() {
        bitField0_ = (bitField0_ & ~0x00000008);
        attributes_ = getDefaultInstance().getAttributes();
        onChanged();
        return this;
      }
      void setAttributes(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        attributes_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xuanwu.msggate.common.protobuf.mt.TResponse)
    }
    
    static {
      defaultInstance = new TResponse(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xuanwu.msggate.common.protobuf.mt.TResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xuanwu_msggate_common_protobuf_mt_TResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xuanwu_msggate_common_protobuf_mt_TResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020MTResponse.proto\022%com.xuanwu.msggate.c" +
      "ommon.protobuf.mt\032\020CommonItem.proto\"\244\001\n\t" +
      "TResponse\022:\n\006result\030\001 \002(\0162*.com.xuanwu.m" +
      "sggate.common.protobuf.Result\0226\n\004uuid\030\002 " +
      "\001(\0132(.com.xuanwu.msggate.common.protobuf" +
      ".UUID\022\017\n\007message\030\003 \001(\t\022\022\n\nattributes\030\004 \001" +
      "(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xuanwu_msggate_common_protobuf_mt_TResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xuanwu_msggate_common_protobuf_mt_TResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xuanwu_msggate_common_protobuf_mt_TResponse_descriptor,
              new java.lang.String[] { "Result", "Uuid", "Message", "Attributes", },
              com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse.class,
              com.xuanwu.msggate.common.protobuf.mt.MTResponse.TResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xuanwu.msggate.common.protobuf.CommonItem.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}