// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceBattlePickBox.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceBattlePickBox {
  private XinqiBceBattlePickBox() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceBattlePickBoxOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated int32 boxindex = 1;
    java.util.List<java.lang.Integer> getBoxindexList();
    int getBoxindexCount();
    int getBoxindex(int index);
    
    // optional string sessionId = 2;
    boolean hasSessionId();
    String getSessionId();
  }
  public static final class BceBattlePickBox extends
      com.google.protobuf.GeneratedMessage
      implements BceBattlePickBoxOrBuilder {
    // Use BceBattlePickBox.newBuilder() to construct.
    private BceBattlePickBox(Builder builder) {
      super(builder);
    }
    private BceBattlePickBox(boolean noInit) {}
    
    private static final BceBattlePickBox defaultInstance;
    public static BceBattlePickBox getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceBattlePickBox getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.internal_static_com_xinqihd_sns_gameserver_proto_BceBattlePickBox_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.internal_static_com_xinqihd_sns_gameserver_proto_BceBattlePickBox_fieldAccessorTable;
    }
    
    private int bitField0_;
    // repeated int32 boxindex = 1;
    public static final int BOXINDEX_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Integer> boxindex_;
    public java.util.List<java.lang.Integer>
        getBoxindexList() {
      return boxindex_;
    }
    public int getBoxindexCount() {
      return boxindex_.size();
    }
    public int getBoxindex(int index) {
      return boxindex_.get(index);
    }
    
    // optional string sessionId = 2;
    public static final int SESSIONID_FIELD_NUMBER = 2;
    private java.lang.Object sessionId_;
    public boolean hasSessionId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
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
    
    private void initFields() {
      boxindex_ = java.util.Collections.emptyList();;
      sessionId_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < boxindex_.size(); i++) {
        output.writeInt32(1, boxindex_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(2, getSessionIdBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < boxindex_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(boxindex_.get(i));
        }
        size += dataSize;
        size += 1 * getBoxindexList().size();
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getSessionIdBytes());
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBoxOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.internal_static_com_xinqihd_sns_gameserver_proto_BceBattlePickBox_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.internal_static_com_xinqihd_sns_gameserver_proto_BceBattlePickBox_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        boxindex_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000001);
        sessionId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox result = new com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          boxindex_ = java.util.Collections.unmodifiableList(boxindex_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.boxindex_ = boxindex_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sessionId_ = sessionId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox.getDefaultInstance()) return this;
        if (!other.boxindex_.isEmpty()) {
          if (boxindex_.isEmpty()) {
            boxindex_ = other.boxindex_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBoxindexIsMutable();
            boxindex_.addAll(other.boxindex_);
          }
          onChanged();
        }
        if (other.hasSessionId()) {
          setSessionId(other.getSessionId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
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
              ensureBoxindexIsMutable();
              boxindex_.add(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addBoxindex(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              sessionId_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated int32 boxindex = 1;
      private java.util.List<java.lang.Integer> boxindex_ = java.util.Collections.emptyList();;
      private void ensureBoxindexIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          boxindex_ = new java.util.ArrayList<java.lang.Integer>(boxindex_);
          bitField0_ |= 0x00000001;
         }
      }
      public java.util.List<java.lang.Integer>
          getBoxindexList() {
        return java.util.Collections.unmodifiableList(boxindex_);
      }
      public int getBoxindexCount() {
        return boxindex_.size();
      }
      public int getBoxindex(int index) {
        return boxindex_.get(index);
      }
      public Builder setBoxindex(
          int index, int value) {
        ensureBoxindexIsMutable();
        boxindex_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addBoxindex(int value) {
        ensureBoxindexIsMutable();
        boxindex_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllBoxindex(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureBoxindexIsMutable();
        super.addAll(values, boxindex_);
        onChanged();
        return this;
      }
      public Builder clearBoxindex() {
        boxindex_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      
      // optional string sessionId = 2;
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
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceBattlePickBox)
    }
    
    static {
      defaultInstance = new BceBattlePickBox(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceBattlePickBox)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceBattlePickBox_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceBattlePickBox_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026BceBattlePickBox.proto\022 com.xinqihd.sn" +
      "s.gameserver.proto\"7\n\020BceBattlePickBox\022\020" +
      "\n\010boxindex\030\001 \003(\005\022\021\n\tsessionId\030\002 \001(\tB\027B\025X" +
      "inqiBceBattlePickBox"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceBattlePickBox_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceBattlePickBox_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceBattlePickBox_descriptor,
              new java.lang.String[] { "Boxindex", "SessionId", },
              com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceBattlePickBox.BceBattlePickBox.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
