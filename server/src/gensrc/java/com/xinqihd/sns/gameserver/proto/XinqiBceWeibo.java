// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceWeibo.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceWeibo {
  private XinqiBceWeibo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceWeiboOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string account = 1;
    boolean hasAccount();
    String getAccount();
    
    // optional string weibo = 2;
    boolean hasWeibo();
    String getWeibo();
    
    // optional int32 optype = 3;
    boolean hasOptype();
    int getOptype();
    
    // optional string token = 4;
    boolean hasToken();
    String getToken();
  }
  public static final class BceWeibo extends
      com.google.protobuf.GeneratedMessage
      implements BceWeiboOrBuilder {
    // Use BceWeibo.newBuilder() to construct.
    private BceWeibo(Builder builder) {
      super(builder);
    }
    private BceWeibo(boolean noInit) {}
    
    private static final BceWeibo defaultInstance;
    public static BceWeibo getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceWeibo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.internal_static_com_xinqihd_sns_gameserver_proto_BceWeibo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.internal_static_com_xinqihd_sns_gameserver_proto_BceWeibo_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string account = 1;
    public static final int ACCOUNT_FIELD_NUMBER = 1;
    private java.lang.Object account_;
    public boolean hasAccount() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getAccount() {
      java.lang.Object ref = account_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          account_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getAccountBytes() {
      java.lang.Object ref = account_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        account_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string weibo = 2;
    public static final int WEIBO_FIELD_NUMBER = 2;
    private java.lang.Object weibo_;
    public boolean hasWeibo() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getWeibo() {
      java.lang.Object ref = weibo_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          weibo_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getWeiboBytes() {
      java.lang.Object ref = weibo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        weibo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 optype = 3;
    public static final int OPTYPE_FIELD_NUMBER = 3;
    private int optype_;
    public boolean hasOptype() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getOptype() {
      return optype_;
    }
    
    // optional string token = 4;
    public static final int TOKEN_FIELD_NUMBER = 4;
    private java.lang.Object token_;
    public boolean hasToken() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getToken() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          token_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      account_ = "";
      weibo_ = "";
      optype_ = 0;
      token_ = "";
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
        output.writeBytes(1, getAccountBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getWeiboBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, optype_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getTokenBytes());
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
          .computeBytesSize(1, getAccountBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getWeiboBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, optype_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getTokenBytes());
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeiboOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.internal_static_com_xinqihd_sns_gameserver_proto_BceWeibo_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.internal_static_com_xinqihd_sns_gameserver_proto_BceWeibo_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo.newBuilder()
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
        account_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        weibo_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        optype_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        token_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo result = new com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.account_ = account_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.weibo_ = weibo_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.optype_ = optype_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.token_ = token_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo.getDefaultInstance()) return this;
        if (other.hasAccount()) {
          setAccount(other.getAccount());
        }
        if (other.hasWeibo()) {
          setWeibo(other.getWeibo());
        }
        if (other.hasOptype()) {
          setOptype(other.getOptype());
        }
        if (other.hasToken()) {
          setToken(other.getToken());
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
              account_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              weibo_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              optype_ = input.readInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              token_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string account = 1;
      private java.lang.Object account_ = "";
      public boolean hasAccount() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getAccount() {
        java.lang.Object ref = account_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          account_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setAccount(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        account_ = value;
        onChanged();
        return this;
      }
      public Builder clearAccount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        account_ = getDefaultInstance().getAccount();
        onChanged();
        return this;
      }
      void setAccount(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        account_ = value;
        onChanged();
      }
      
      // optional string weibo = 2;
      private java.lang.Object weibo_ = "";
      public boolean hasWeibo() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getWeibo() {
        java.lang.Object ref = weibo_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          weibo_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setWeibo(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        weibo_ = value;
        onChanged();
        return this;
      }
      public Builder clearWeibo() {
        bitField0_ = (bitField0_ & ~0x00000002);
        weibo_ = getDefaultInstance().getWeibo();
        onChanged();
        return this;
      }
      void setWeibo(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        weibo_ = value;
        onChanged();
      }
      
      // optional int32 optype = 3;
      private int optype_ ;
      public boolean hasOptype() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getOptype() {
        return optype_;
      }
      public Builder setOptype(int value) {
        bitField0_ |= 0x00000004;
        optype_ = value;
        onChanged();
        return this;
      }
      public Builder clearOptype() {
        bitField0_ = (bitField0_ & ~0x00000004);
        optype_ = 0;
        onChanged();
        return this;
      }
      
      // optional string token = 4;
      private java.lang.Object token_ = "";
      public boolean hasToken() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getToken() {
        java.lang.Object ref = token_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          token_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setToken(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        token_ = value;
        onChanged();
        return this;
      }
      public Builder clearToken() {
        bitField0_ = (bitField0_ & ~0x00000008);
        token_ = getDefaultInstance().getToken();
        onChanged();
        return this;
      }
      void setToken(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        token_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceWeibo)
    }
    
    static {
      defaultInstance = new BceWeibo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceWeibo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceWeibo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceWeibo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016BceWeibo.proto\022 com.xinqihd.sns.gamese" +
      "rver.proto\"I\n\010BceWeibo\022\017\n\007account\030\001 \001(\t\022" +
      "\r\n\005weibo\030\002 \001(\t\022\016\n\006optype\030\003 \001(\005\022\r\n\005token\030" +
      "\004 \001(\tB\017B\rXinqiBceWeibo"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceWeibo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceWeibo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceWeibo_descriptor,
              new java.lang.String[] { "Account", "Weibo", "Optype", "Token", },
              com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceWeibo.BceWeibo.Builder.class);
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