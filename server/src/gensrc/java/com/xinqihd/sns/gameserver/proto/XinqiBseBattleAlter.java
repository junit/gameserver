// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseBattleAlter.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseBattleAlter {
  private XinqiBseBattleAlter() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseBattleAlterOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 type = 1;
    boolean hasType();
    int getType();
    
    // required string sessionId = 2;
    boolean hasSessionId();
    String getSessionId();
    
    // repeated .com.xinqihd.sns.gameserver.proto.RoleInfo roleArr = 3;
    java.util.List<com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo> 
        getRoleArrList();
    com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo getRoleArr(int index);
    int getRoleArrCount();
    java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfoOrBuilder> 
        getRoleArrOrBuilderList();
    com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfoOrBuilder getRoleArrOrBuilder(
        int index);
  }
  public static final class BseBattleAlter extends
      com.google.protobuf.GeneratedMessage
      implements BseBattleAlterOrBuilder {
    // Use BseBattleAlter.newBuilder() to construct.
    private BseBattleAlter(Builder builder) {
      super(builder);
    }
    private BseBattleAlter(boolean noInit) {}
    
    private static final BseBattleAlter defaultInstance;
    public static BseBattleAlter getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseBattleAlter getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.internal_static_com_xinqihd_sns_gameserver_proto_BseBattleAlter_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.internal_static_com_xinqihd_sns_gameserver_proto_BseBattleAlter_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getType() {
      return type_;
    }
    
    // required string sessionId = 2;
    public static final int SESSIONID_FIELD_NUMBER = 2;
    private java.lang.Object sessionId_;
    public boolean hasSessionId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          sessionId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // repeated .com.xinqihd.sns.gameserver.proto.RoleInfo roleArr = 3;
    public static final int ROLEARR_FIELD_NUMBER = 3;
    private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo> roleArr_;
    public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo> getRoleArrList() {
      return roleArr_;
    }
    public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfoOrBuilder> 
        getRoleArrOrBuilderList() {
      return roleArr_;
    }
    public int getRoleArrCount() {
      return roleArr_.size();
    }
    public com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo getRoleArr(int index) {
      return roleArr_.get(index);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfoOrBuilder getRoleArrOrBuilder(
        int index) {
      return roleArr_.get(index);
    }
    
    private void initFields() {
      type_ = 0;
      sessionId_ = "";
      roleArr_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSessionId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getRoleArrCount(); i++) {
        if (!getRoleArr(i).isInitialized()) {
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
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getSessionIdBytes());
      }
      for (int i = 0; i < roleArr_.size(); i++) {
        output.writeMessage(3, roleArr_.get(i));
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
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getSessionIdBytes());
      }
      for (int i = 0; i < roleArr_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, roleArr_.get(i));
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.internal_static_com_xinqihd_sns_gameserver_proto_BseBattleAlter_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.internal_static_com_xinqihd_sns_gameserver_proto_BseBattleAlter_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getRoleArrFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        sessionId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (roleArrBuilder_ == null) {
          roleArr_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          roleArrBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter result = new com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.sessionId_ = sessionId_;
        if (roleArrBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            roleArr_ = java.util.Collections.unmodifiableList(roleArr_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.roleArr_ = roleArr_;
        } else {
          result.roleArr_ = roleArrBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasSessionId()) {
          setSessionId(other.getSessionId());
        }
        if (roleArrBuilder_ == null) {
          if (!other.roleArr_.isEmpty()) {
            if (roleArr_.isEmpty()) {
              roleArr_ = other.roleArr_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureRoleArrIsMutable();
              roleArr_.addAll(other.roleArr_);
            }
            onChanged();
          }
        } else {
          if (!other.roleArr_.isEmpty()) {
            if (roleArrBuilder_.isEmpty()) {
              roleArrBuilder_.dispose();
              roleArrBuilder_ = null;
              roleArr_ = other.roleArr_;
              bitField0_ = (bitField0_ & ~0x00000004);
              roleArrBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getRoleArrFieldBuilder() : null;
            } else {
              roleArrBuilder_.addAllMessages(other.roleArr_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        if (!hasSessionId()) {
          
          return false;
        }
        for (int i = 0; i < getRoleArrCount(); i++) {
          if (!getRoleArr(i).isInitialized()) {
            
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
              bitField0_ |= 0x00000001;
              type_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              sessionId_ = input.readBytes();
              break;
            }
            case 26: {
              com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder subBuilder = com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addRoleArr(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 type = 1;
      private int type_ ;
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getType() {
        return type_;
      }
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }
      
      // required string sessionId = 2;
      private java.lang.Object sessionId_ = "";
      public boolean hasSessionId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getSessionId() {
        java.lang.Object ref = sessionId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          sessionId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSessionId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        sessionId_ = value;
        onChanged();
        return this;
      }
      public Builder clearSessionId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sessionId_ = getDefaultInstance().getSessionId();
        onChanged();
        return this;
      }
      void setSessionId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        sessionId_ = value;
        onChanged();
      }
      
      // repeated .com.xinqihd.sns.gameserver.proto.RoleInfo roleArr = 3;
      private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo> roleArr_ =
        java.util.Collections.emptyList();
      private void ensureRoleArrIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          roleArr_ = new java.util.ArrayList<com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo>(roleArr_);
          bitField0_ |= 0x00000004;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfoOrBuilder> roleArrBuilder_;
      
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo> getRoleArrList() {
        if (roleArrBuilder_ == null) {
          return java.util.Collections.unmodifiableList(roleArr_);
        } else {
          return roleArrBuilder_.getMessageList();
        }
      }
      public int getRoleArrCount() {
        if (roleArrBuilder_ == null) {
          return roleArr_.size();
        } else {
          return roleArrBuilder_.getCount();
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo getRoleArr(int index) {
        if (roleArrBuilder_ == null) {
          return roleArr_.get(index);
        } else {
          return roleArrBuilder_.getMessage(index);
        }
      }
      public Builder setRoleArr(
          int index, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo value) {
        if (roleArrBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRoleArrIsMutable();
          roleArr_.set(index, value);
          onChanged();
        } else {
          roleArrBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setRoleArr(
          int index, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder builderForValue) {
        if (roleArrBuilder_ == null) {
          ensureRoleArrIsMutable();
          roleArr_.set(index, builderForValue.build());
          onChanged();
        } else {
          roleArrBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addRoleArr(com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo value) {
        if (roleArrBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRoleArrIsMutable();
          roleArr_.add(value);
          onChanged();
        } else {
          roleArrBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addRoleArr(
          int index, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo value) {
        if (roleArrBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRoleArrIsMutable();
          roleArr_.add(index, value);
          onChanged();
        } else {
          roleArrBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addRoleArr(
          com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder builderForValue) {
        if (roleArrBuilder_ == null) {
          ensureRoleArrIsMutable();
          roleArr_.add(builderForValue.build());
          onChanged();
        } else {
          roleArrBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addRoleArr(
          int index, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder builderForValue) {
        if (roleArrBuilder_ == null) {
          ensureRoleArrIsMutable();
          roleArr_.add(index, builderForValue.build());
          onChanged();
        } else {
          roleArrBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllRoleArr(
          java.lang.Iterable<? extends com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo> values) {
        if (roleArrBuilder_ == null) {
          ensureRoleArrIsMutable();
          super.addAll(values, roleArr_);
          onChanged();
        } else {
          roleArrBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearRoleArr() {
        if (roleArrBuilder_ == null) {
          roleArr_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          roleArrBuilder_.clear();
        }
        return this;
      }
      public Builder removeRoleArr(int index) {
        if (roleArrBuilder_ == null) {
          ensureRoleArrIsMutable();
          roleArr_.remove(index);
          onChanged();
        } else {
          roleArrBuilder_.remove(index);
        }
        return this;
      }
      public com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder getRoleArrBuilder(
          int index) {
        return getRoleArrFieldBuilder().getBuilder(index);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfoOrBuilder getRoleArrOrBuilder(
          int index) {
        if (roleArrBuilder_ == null) {
          return roleArr_.get(index);  } else {
          return roleArrBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfoOrBuilder> 
           getRoleArrOrBuilderList() {
        if (roleArrBuilder_ != null) {
          return roleArrBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(roleArr_);
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder addRoleArrBuilder() {
        return getRoleArrFieldBuilder().addBuilder(
            com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.getDefaultInstance());
      }
      public com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder addRoleArrBuilder(
          int index) {
        return getRoleArrFieldBuilder().addBuilder(
            index, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.getDefaultInstance());
      }
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder> 
           getRoleArrBuilderList() {
        return getRoleArrFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfoOrBuilder> 
          getRoleArrFieldBuilder() {
        if (roleArrBuilder_ == null) {
          roleArrBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.RoleInfoOrBuilder>(
                  roleArr_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          roleArr_ = null;
        }
        return roleArrBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseBattleAlter)
    }
    
    static {
      defaultInstance = new BseBattleAlter(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseBattleAlter)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseBattleAlter_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseBattleAlter_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024BseBattleAlter.proto\022 com.xinqihd.sns." +
      "gameserver.proto\032\016RoleInfo.proto\"n\n\016BseB" +
      "attleAlter\022\014\n\004type\030\001 \002(\005\022\021\n\tsessionId\030\002 " +
      "\002(\t\022;\n\007roleArr\030\003 \003(\0132*.com.xinqihd.sns.g" +
      "ameserver.proto.RoleInfoB\025B\023XinqiBseBatt" +
      "leAlter"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseBattleAlter_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseBattleAlter_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseBattleAlter_descriptor,
              new java.lang.String[] { "Type", "SessionId", "RoleArr", },
              com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseBattleAlter.BseBattleAlter.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiRoleInfo.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}