-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseTip_pb', package.seeall)


local BSETIP = protobuf.Descriptor();
local BSETIP_TIPS_FIELD = protobuf.FieldDescriptor();

BSETIP_TIPS_FIELD.name = "tips"
BSETIP_TIPS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseTip.tips"
BSETIP_TIPS_FIELD.number = 1
BSETIP_TIPS_FIELD.index = 0
BSETIP_TIPS_FIELD.label = 3
BSETIP_TIPS_FIELD.has_default_value = false
BSETIP_TIPS_FIELD.default_value = {}
BSETIP_TIPS_FIELD.type = 9
BSETIP_TIPS_FIELD.cpp_type = 9

BSETIP.name = "BseTip"
BSETIP.full_name = ".com.xinqihd.sns.gameserver.proto.BseTip"
BSETIP.nested_types = {}
BSETIP.enum_types = {}
BSETIP.fields = {BSETIP_TIPS_FIELD}
BSETIP.is_extendable = false
BSETIP.extensions = {}

BseTip = protobuf.Message(BSETIP)
_G.BSETIP_PB_BSETIP = BSETIP
