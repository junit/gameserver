-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseAddProp_pb', package.seeall)


local BSEADDPROP = protobuf.Descriptor();
local BSEADDPROP_ADDEDPROP_FIELD = protobuf.FieldDescriptor();

BSEADDPROP_ADDEDPROP_FIELD.name = "addedProp"
BSEADDPROP_ADDEDPROP_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseAddProp.addedProp"
BSEADDPROP_ADDEDPROP_FIELD.number = 1
BSEADDPROP_ADDEDPROP_FIELD.index = 0
BSEADDPROP_ADDEDPROP_FIELD.label = 2
BSEADDPROP_ADDEDPROP_FIELD.has_default_value = false
BSEADDPROP_ADDEDPROP_FIELD.default_value = nil
BSEADDPROP_ADDEDPROP_FIELD.message_type = PROPDATA_PB_PROPDATA
BSEADDPROP_ADDEDPROP_FIELD.type = 11
BSEADDPROP_ADDEDPROP_FIELD.cpp_type = 10

BSEADDPROP.name = "BseAddProp"
BSEADDPROP.full_name = ".com.xinqihd.sns.gameserver.proto.BseAddProp"
BSEADDPROP.nested_types = {}
BSEADDPROP.enum_types = {}
BSEADDPROP.fields = {BSEADDPROP_ADDEDPROP_FIELD}
BSEADDPROP.is_extendable = false
BSEADDPROP.extensions = {}

BseAddProp = protobuf.Message(BSEADDPROP)
_G.BSEADDPROP_PB_BSEADDPROP = BSEADDPROP

