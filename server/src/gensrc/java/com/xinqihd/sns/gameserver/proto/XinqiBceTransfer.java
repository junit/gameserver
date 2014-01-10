// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceTransfer.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceTransfer {
  private XinqiBceTransfer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceTransferOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 srcEquipPew = 1;
    boolean hasSrcEquipPew();
    int getSrcEquipPew();
    
    // required int32 tarEquipPew = 2;
    boolean hasTarEquipPew();
    int getTarEquipPew();
  }
  public static final class BceTransfer extends
      com.google.protobuf.GeneratedMessage
      implements BceTransferOrBuilder {
    // Use BceTransfer.newBuilder() to construct.
    private BceTransfer(Builder builder) {
      super(builder);
    }
    private BceTransfer(boolean noInit) {}
    
    private static final BceTransfer defaultInstance;
    public static BceTransfer getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceTransfer getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.internal_static_com_xinqihd_sns_gameserver_proto_BceTransfer_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.internal_static_com_xinqihd_sns_gameserver_proto_BceTransfer_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 srcEquipPew = 1;
    public static final int SRCEQUIPPEW_FIELD_NUMBER = 1;
    private int srcEquipPew_;
    public boolean hasSrcEquipPew() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getSrcEquipPew() {
      return srcEquipPew_;
    }
    
    // required int32 tarEquipPew = 2;
    public static final int TAREQUIPPEW_FIELD_NUMBER = 2;
    private int tarEquipPew_;
    public boolean hasTarEquipPew() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getTarEquipPew() {
      return tarEquipPew_;
    }
    
    private void initFields() {
      srcEquipPew_ = 0;
      tarEquipPew_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSrcEquipPew()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTarEquipPew()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, srcEquipPew_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, tarEquipPew_);
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
          .computeInt32Size(1, srcEquipPew_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, tarEquipPew_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransferOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.internal_static_com_xinqihd_sns_gameserver_proto_BceTransfer_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.internal_static_com_xinqihd_sns_gameserver_proto_BceTransfer_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer.newBuilder()
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
        srcEquipPew_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        tarEquipPew_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer result = new com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.srcEquipPew_ = srcEquipPew_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.tarEquipPew_ = tarEquipPew_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer.getDefaultInstance()) return this;
        if (other.hasSrcEquipPew()) {
          setSrcEquipPew(other.getSrcEquipPew());
        }
        if (other.hasTarEquipPew()) {
          setTarEquipPew(other.getTarEquipPew());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSrcEquipPew()) {
          
          return false;
        }
        if (!hasTarEquipPew()) {
          
          return false;
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
              srcEquipPew_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              tarEquipPew_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 srcEquipPew = 1;
      private int srcEquipPew_ ;
      public boolean hasSrcEquipPew() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getSrcEquipPew() {
        return srcEquipPew_;
      }
      public Builder setSrcEquipPew(int value) {
        bitField0_ |= 0x00000001;
        srcEquipPew_ = value;
        onChanged();
        return this;
      }
      public Builder clearSrcEquipPew() {
        bitField0_ = (bitField0_ & ~0x00000001);
        srcEquipPew_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 tarEquipPew = 2;
      private int tarEquipPew_ ;
      public boolean hasTarEquipPew() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getTarEquipPew() {
        return tarEquipPew_;
      }
      public Builder setTarEquipPew(int value) {
        bitField0_ |= 0x00000002;
        tarEquipPew_ = value;
        onChanged();
        return this;
      }
      public Builder clearTarEquipPew() {
        bitField0_ = (bitField0_ & ~0x00000002);
        tarEquipPew_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceTransfer)
    }
    
    static {
      defaultInstance = new BceTransfer(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceTransfer)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceTransfer_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceTransfer_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BceTransfer.proto\022 com.xinqihd.sns.gam" +
      "eserver.proto\"7\n\013BceTransfer\022\023\n\013srcEquip" +
      "Pew\030\001 \002(\005\022\023\n\013tarEquipPew\030\002 \002(\005B\022B\020XinqiB" +
      "ceTransfer"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceTransfer_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceTransfer_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceTransfer_descriptor,
              new java.lang.String[] { "SrcEquipPew", "TarEquipPew", },
              com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceTransfer.BceTransfer.Builder.class);
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