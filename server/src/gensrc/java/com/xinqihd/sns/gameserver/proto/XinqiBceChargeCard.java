// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceChargeCard.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceChargeCard {
  private XinqiBceChargeCard() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceChargeCardOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string cardno = 1;
    boolean hasCardno();
    String getCardno();
    
    // optional string cardpwd = 2;
    boolean hasCardpwd();
    String getCardpwd();
    
    // optional string cardtype = 3;
    boolean hasCardtype();
    String getCardtype();
    
    // optional int32 money = 4;
    boolean hasMoney();
    int getMoney();
  }
  public static final class BceChargeCard extends
      com.google.protobuf.GeneratedMessage
      implements BceChargeCardOrBuilder {
    // Use BceChargeCard.newBuilder() to construct.
    private BceChargeCard(Builder builder) {
      super(builder);
    }
    private BceChargeCard(boolean noInit) {}
    
    private static final BceChargeCard defaultInstance;
    public static BceChargeCard getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceChargeCard getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.internal_static_com_xinqihd_sns_gameserver_proto_BceChargeCard_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.internal_static_com_xinqihd_sns_gameserver_proto_BceChargeCard_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string cardno = 1;
    public static final int CARDNO_FIELD_NUMBER = 1;
    private java.lang.Object cardno_;
    public boolean hasCardno() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getCardno() {
      java.lang.Object ref = cardno_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          cardno_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getCardnoBytes() {
      java.lang.Object ref = cardno_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        cardno_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string cardpwd = 2;
    public static final int CARDPWD_FIELD_NUMBER = 2;
    private java.lang.Object cardpwd_;
    public boolean hasCardpwd() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getCardpwd() {
      java.lang.Object ref = cardpwd_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          cardpwd_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getCardpwdBytes() {
      java.lang.Object ref = cardpwd_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        cardpwd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string cardtype = 3;
    public static final int CARDTYPE_FIELD_NUMBER = 3;
    private java.lang.Object cardtype_;
    public boolean hasCardtype() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getCardtype() {
      java.lang.Object ref = cardtype_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          cardtype_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getCardtypeBytes() {
      java.lang.Object ref = cardtype_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        cardtype_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 money = 4;
    public static final int MONEY_FIELD_NUMBER = 4;
    private int money_;
    public boolean hasMoney() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getMoney() {
      return money_;
    }
    
    private void initFields() {
      cardno_ = "";
      cardpwd_ = "";
      cardtype_ = "";
      money_ = 0;
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getCardnoBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getCardpwdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getCardtypeBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, money_);
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
          .computeBytesSize(1, getCardnoBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getCardpwdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getCardtypeBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, money_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCardOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.internal_static_com_xinqihd_sns_gameserver_proto_BceChargeCard_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.internal_static_com_xinqihd_sns_gameserver_proto_BceChargeCard_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard.newBuilder()
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
        cardno_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        cardpwd_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        cardtype_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        money_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard result = new com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.cardno_ = cardno_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.cardpwd_ = cardpwd_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.cardtype_ = cardtype_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.money_ = money_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard.getDefaultInstance()) return this;
        if (other.hasCardno()) {
          setCardno(other.getCardno());
        }
        if (other.hasCardpwd()) {
          setCardpwd(other.getCardpwd());
        }
        if (other.hasCardtype()) {
          setCardtype(other.getCardtype());
        }
        if (other.hasMoney()) {
          setMoney(other.getMoney());
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
            case 10: {
              bitField0_ |= 0x00000001;
              cardno_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              cardpwd_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              cardtype_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              money_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string cardno = 1;
      private java.lang.Object cardno_ = "";
      public boolean hasCardno() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getCardno() {
        java.lang.Object ref = cardno_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          cardno_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setCardno(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        cardno_ = value;
        onChanged();
        return this;
      }
      public Builder clearCardno() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cardno_ = getDefaultInstance().getCardno();
        onChanged();
        return this;
      }
      void setCardno(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        cardno_ = value;
        onChanged();
      }
      
      // optional string cardpwd = 2;
      private java.lang.Object cardpwd_ = "";
      public boolean hasCardpwd() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getCardpwd() {
        java.lang.Object ref = cardpwd_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          cardpwd_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setCardpwd(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        cardpwd_ = value;
        onChanged();
        return this;
      }
      public Builder clearCardpwd() {
        bitField0_ = (bitField0_ & ~0x00000002);
        cardpwd_ = getDefaultInstance().getCardpwd();
        onChanged();
        return this;
      }
      void setCardpwd(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        cardpwd_ = value;
        onChanged();
      }
      
      // optional string cardtype = 3;
      private java.lang.Object cardtype_ = "";
      public boolean hasCardtype() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getCardtype() {
        java.lang.Object ref = cardtype_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          cardtype_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setCardtype(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        cardtype_ = value;
        onChanged();
        return this;
      }
      public Builder clearCardtype() {
        bitField0_ = (bitField0_ & ~0x00000004);
        cardtype_ = getDefaultInstance().getCardtype();
        onChanged();
        return this;
      }
      void setCardtype(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        cardtype_ = value;
        onChanged();
      }
      
      // optional int32 money = 4;
      private int money_ ;
      public boolean hasMoney() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getMoney() {
        return money_;
      }
      public Builder setMoney(int value) {
        bitField0_ |= 0x00000008;
        money_ = value;
        onChanged();
        return this;
      }
      public Builder clearMoney() {
        bitField0_ = (bitField0_ & ~0x00000008);
        money_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceChargeCard)
    }
    
    static {
      defaultInstance = new BceChargeCard(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceChargeCard)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceChargeCard_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceChargeCard_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023BceChargeCard.proto\022 com.xinqihd.sns.g" +
      "ameserver.proto\"Q\n\rBceChargeCard\022\016\n\006card" +
      "no\030\001 \001(\t\022\017\n\007cardpwd\030\002 \001(\t\022\020\n\010cardtype\030\003 " +
      "\001(\t\022\r\n\005money\030\004 \001(\005B\024B\022XinqiBceChargeCard"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceChargeCard_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceChargeCard_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceChargeCard_descriptor,
              new java.lang.String[] { "Cardno", "Cardpwd", "Cardtype", "Money", },
              com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceChargeCard.BceChargeCard.Builder.class);
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
