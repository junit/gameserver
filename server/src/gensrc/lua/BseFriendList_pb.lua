-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseFriendList_pb', package.seeall)


local BSEFRIENDLIST = protobuf.Descriptor();
local BSEFRIENDLIST_TYPE_FIELD = protobuf.FieldDescriptor();
local BSEFRIENDLIST_FRIENDLIST_FIELD = protobuf.FieldDescriptor();

BSEFRIENDLIST_TYPE_FIELD.name = "type"
BSEFRIENDLIST_TYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseFriendList.type"
BSEFRIENDLIST_TYPE_FIELD.number = 1
BSEFRIENDLIST_TYPE_FIELD.index = 0
BSEFRIENDLIST_TYPE_FIELD.label = 2
BSEFRIENDLIST_TYPE_FIELD.has_default_value = false
BSEFRIENDLIST_TYPE_FIELD.default_value = 0
BSEFRIENDLIST_TYPE_FIELD.type = 5
BSEFRIENDLIST_TYPE_FIELD.cpp_type = 1

BSEFRIENDLIST_FRIENDLIST_FIELD.name = "friendList"
BSEFRIENDLIST_FRIENDLIST_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseFriendList.friendList"
BSEFRIENDLIST_FRIENDLIST_FIELD.number = 2
BSEFRIENDLIST_FRIENDLIST_FIELD.index = 1
BSEFRIENDLIST_FRIENDLIST_FIELD.label = 3
BSEFRIENDLIST_FRIENDLIST_FIELD.has_default_value = false
BSEFRIENDLIST_FRIENDLIST_FIELD.default_value = {}
BSEFRIENDLIST_FRIENDLIST_FIELD.message_type = FRIENDINFOLITE_PB_FRIENDINFOLITE
BSEFRIENDLIST_FRIENDLIST_FIELD.type = 11
BSEFRIENDLIST_FRIENDLIST_FIELD.cpp_type = 10

BSEFRIENDLIST.name = "BseFriendList"
BSEFRIENDLIST.full_name = ".com.xinqihd.sns.gameserver.proto.BseFriendList"
BSEFRIENDLIST.nested_types = {}
BSEFRIENDLIST.enum_types = {}
BSEFRIENDLIST.fields = {BSEFRIENDLIST_TYPE_FIELD, BSEFRIENDLIST_FRIENDLIST_FIELD}
BSEFRIENDLIST.is_extendable = false
BSEFRIENDLIST.extensions = {}

BseFriendList = protobuf.Message(BSEFRIENDLIST)
_G.BSEFRIENDLIST_PB_BSEFRIENDLIST = BSEFRIENDLIST

