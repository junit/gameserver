-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseClearLeaveMessage_pb', package.seeall)


local BSECLEARLEAVEMESSAGE = protobuf.Descriptor();
local BSECLEARLEAVEMESSAGE_SUCC_FIELD = protobuf.FieldDescriptor();

BSECLEARLEAVEMESSAGE_SUCC_FIELD.name = "succ"
BSECLEARLEAVEMESSAGE_SUCC_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseClearLeaveMessage.succ"
BSECLEARLEAVEMESSAGE_SUCC_FIELD.number = 1
BSECLEARLEAVEMESSAGE_SUCC_FIELD.index = 0
BSECLEARLEAVEMESSAGE_SUCC_FIELD.label = 2
BSECLEARLEAVEMESSAGE_SUCC_FIELD.has_default_value = false
BSECLEARLEAVEMESSAGE_SUCC_FIELD.default_value = false
BSECLEARLEAVEMESSAGE_SUCC_FIELD.type = 8
BSECLEARLEAVEMESSAGE_SUCC_FIELD.cpp_type = 7

BSECLEARLEAVEMESSAGE.name = "BseClearLeaveMessage"
BSECLEARLEAVEMESSAGE.full_name = ".com.xinqihd.sns.gameserver.proto.BseClearLeaveMessage"
BSECLEARLEAVEMESSAGE.nested_types = {}
BSECLEARLEAVEMESSAGE.enum_types = {}
BSECLEARLEAVEMESSAGE.fields = {BSECLEARLEAVEMESSAGE_SUCC_FIELD}
BSECLEARLEAVEMESSAGE.is_extendable = false
BSECLEARLEAVEMESSAGE.extensions = {}

BseClearLeaveMessage = protobuf.Message(BSECLEARLEAVEMESSAGE)
_G.BSECLEARLEAVEMESSAGE_PB_BSECLEARLEAVEMESSAGE = BSECLEARLEAVEMESSAGE

