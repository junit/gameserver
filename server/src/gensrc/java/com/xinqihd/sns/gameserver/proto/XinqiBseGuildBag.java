// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseGuildBag.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseGuildBag {
  private XinqiBseGuildBag() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseGuildBagOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string guildID = 1;
    boolean hasGuildID();
    String getGuildID();
    
    // repeated .com.xinqihd.sns.gameserver.proto.PropData bag = 2;
    java.util.List<com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData> 
        getBagList();
    com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData getBag(int index);
    int getBagCount();
    java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder> 
        getBagOrBuilderList();
    com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder getBagOrBuilder(
        int index);
  }
  public static final class BseGuildBag extends
      com.google.protobuf.GeneratedMessage
      implements BseGuildBagOrBuilder {
    // Use BseGuildBag.newBuilder() to construct.
    private BseGuildBag(Builder builder) {
      super(builder);
    }
    private BseGuildBag(boolean noInit) {}
    
    private static final BseGuildBag defaultInstance;
    public static BseGuildBag getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseGuildBag getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildBag_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildBag_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string guildID = 1;
    public static final int GUILDID_FIELD_NUMBER = 1;
    private java.lang.Object guildID_;
    public boolean hasGuildID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getGuildID() {
      java.lang.Object ref = guildID_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          guildID_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getGuildIDBytes() {
      java.lang.Object ref = guildID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        guildID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // repeated .com.xinqihd.sns.gameserver.proto.PropData bag = 2;
    public static final int BAG_FIELD_NUMBER = 2;
    private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData> bag_;
    public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData> getBagList() {
      return bag_;
    }
    public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder> 
        getBagOrBuilderList() {
      return bag_;
    }
    public int getBagCount() {
      return bag_.size();
    }
    public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData getBag(int index) {
      return bag_.get(index);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder getBagOrBuilder(
        int index) {
      return bag_.get(index);
    }
    
    private void initFields() {
      guildID_ = "";
      bag_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      for (int i = 0; i < getBagCount(); i++) {
        if (!getBag(i).isInitialized()) {
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
        output.writeBytes(1, getGuildIDBytes());
      }
      for (int i = 0; i < bag_.size(); i++) {
        output.writeMessage(2, bag_.get(i));
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
          .computeBytesSize(1, getGuildIDBytes());
      }
      for (int i = 0; i < bag_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, bag_.get(i));
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBagOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildBag_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildBag_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBagFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        guildID_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (bagBuilder_ == null) {
          bag_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          bagBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag result = new com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.guildID_ = guildID_;
        if (bagBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            bag_ = java.util.Collections.unmodifiableList(bag_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.bag_ = bag_;
        } else {
          result.bag_ = bagBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag.getDefaultInstance()) return this;
        if (other.hasGuildID()) {
          setGuildID(other.getGuildID());
        }
        if (bagBuilder_ == null) {
          if (!other.bag_.isEmpty()) {
            if (bag_.isEmpty()) {
              bag_ = other.bag_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureBagIsMutable();
              bag_.addAll(other.bag_);
            }
            onChanged();
          }
        } else {
          if (!other.bag_.isEmpty()) {
            if (bagBuilder_.isEmpty()) {
              bagBuilder_.dispose();
              bagBuilder_ = null;
              bag_ = other.bag_;
              bitField0_ = (bitField0_ & ~0x00000002);
              bagBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getBagFieldBuilder() : null;
            } else {
              bagBuilder_.addAllMessages(other.bag_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        for (int i = 0; i < getBagCount(); i++) {
          if (!getBag(i).isInitialized()) {
            
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
            case 10: {
              bitField0_ |= 0x00000001;
              guildID_ = input.readBytes();
              break;
            }
            case 18: {
              com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder subBuilder = com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addBag(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string guildID = 1;
      private java.lang.Object guildID_ = "";
      public boolean hasGuildID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getGuildID() {
        java.lang.Object ref = guildID_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          guildID_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setGuildID(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        guildID_ = value;
        onChanged();
        return this;
      }
      public Builder clearGuildID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        guildID_ = getDefaultInstance().getGuildID();
        onChanged();
        return this;
      }
      void setGuildID(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        guildID_ = value;
        onChanged();
      }
      
      // repeated .com.xinqihd.sns.gameserver.proto.PropData bag = 2;
      private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData> bag_ =
        java.util.Collections.emptyList();
      private void ensureBagIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          bag_ = new java.util.ArrayList<com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData>(bag_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder> bagBuilder_;
      
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData> getBagList() {
        if (bagBuilder_ == null) {
          return java.util.Collections.unmodifiableList(bag_);
        } else {
          return bagBuilder_.getMessageList();
        }
      }
      public int getBagCount() {
        if (bagBuilder_ == null) {
          return bag_.size();
        } else {
          return bagBuilder_.getCount();
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData getBag(int index) {
        if (bagBuilder_ == null) {
          return bag_.get(index);
        } else {
          return bagBuilder_.getMessage(index);
        }
      }
      public Builder setBag(
          int index, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData value) {
        if (bagBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBagIsMutable();
          bag_.set(index, value);
          onChanged();
        } else {
          bagBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setBag(
          int index, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder builderForValue) {
        if (bagBuilder_ == null) {
          ensureBagIsMutable();
          bag_.set(index, builderForValue.build());
          onChanged();
        } else {
          bagBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addBag(com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData value) {
        if (bagBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBagIsMutable();
          bag_.add(value);
          onChanged();
        } else {
          bagBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addBag(
          int index, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData value) {
        if (bagBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBagIsMutable();
          bag_.add(index, value);
          onChanged();
        } else {
          bagBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addBag(
          com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder builderForValue) {
        if (bagBuilder_ == null) {
          ensureBagIsMutable();
          bag_.add(builderForValue.build());
          onChanged();
        } else {
          bagBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addBag(
          int index, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder builderForValue) {
        if (bagBuilder_ == null) {
          ensureBagIsMutable();
          bag_.add(index, builderForValue.build());
          onChanged();
        } else {
          bagBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllBag(
          java.lang.Iterable<? extends com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData> values) {
        if (bagBuilder_ == null) {
          ensureBagIsMutable();
          super.addAll(values, bag_);
          onChanged();
        } else {
          bagBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearBag() {
        if (bagBuilder_ == null) {
          bag_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          bagBuilder_.clear();
        }
        return this;
      }
      public Builder removeBag(int index) {
        if (bagBuilder_ == null) {
          ensureBagIsMutable();
          bag_.remove(index);
          onChanged();
        } else {
          bagBuilder_.remove(index);
        }
        return this;
      }
      public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder getBagBuilder(
          int index) {
        return getBagFieldBuilder().getBuilder(index);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder getBagOrBuilder(
          int index) {
        if (bagBuilder_ == null) {
          return bag_.get(index);  } else {
          return bagBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder> 
           getBagOrBuilderList() {
        if (bagBuilder_ != null) {
          return bagBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(bag_);
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder addBagBuilder() {
        return getBagFieldBuilder().addBuilder(
            com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.getDefaultInstance());
      }
      public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder addBagBuilder(
          int index) {
        return getBagFieldBuilder().addBuilder(
            index, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.getDefaultInstance());
      }
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder> 
           getBagBuilderList() {
        return getBagFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder> 
          getBagFieldBuilder() {
        if (bagBuilder_ == null) {
          bagBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder>(
                  bag_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          bag_ = null;
        }
        return bagBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseGuildBag)
    }
    
    static {
      defaultInstance = new BseGuildBag(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseGuildBag)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseGuildBag_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseGuildBag_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BseGuildBag.proto\022 com.xinqihd.sns.gam" +
      "eserver.proto\032\016PropData.proto\"W\n\013BseGuil" +
      "dBag\022\017\n\007guildID\030\001 \001(\t\0227\n\003bag\030\002 \003(\0132*.com" +
      ".xinqihd.sns.gameserver.proto.PropDataB\022" +
      "B\020XinqiBseGuildBag"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseGuildBag_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseGuildBag_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseGuildBag_descriptor,
              new java.lang.String[] { "GuildID", "Bag", },
              com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseGuildBag.BseGuildBag.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiPropData.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
