-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseBattleAddRole_pb', package.seeall)


local BSEBATTLEADDROLE = protobuf.Descriptor();
local BSEBATTLEADDROLE_ROOMID_FIELD = protobuf.FieldDescriptor();
local BSEBATTLEADDROLE_CAMPCOUNT_FIELD = protobuf.FieldDescriptor();
local BSEBATTLEADDROLE_ROLEARR_FIELD = protobuf.FieldDescriptor();

BSEBATTLEADDROLE_ROOMID_FIELD.name = "roomId"
BSEBATTLEADDROLE_ROOMID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseBattleAddRole.roomId"
BSEBATTLEADDROLE_ROOMID_FIELD.number = 1
BSEBATTLEADDROLE_ROOMID_FIELD.index = 0
BSEBATTLEADDROLE_ROOMID_FIELD.label = 2
BSEBATTLEADDROLE_ROOMID_FIELD.has_default_value = false
BSEBATTLEADDROLE_ROOMID_FIELD.default_value = 0
BSEBATTLEADDROLE_ROOMID_FIELD.type = 13
BSEBATTLEADDROLE_ROOMID_FIELD.cpp_type = 3

BSEBATTLEADDROLE_CAMPCOUNT_FIELD.name = "campCount"
BSEBATTLEADDROLE_CAMPCOUNT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseBattleAddRole.campCount"
BSEBATTLEADDROLE_CAMPCOUNT_FIELD.number = 2
BSEBATTLEADDROLE_CAMPCOUNT_FIELD.index = 1
BSEBATTLEADDROLE_CAMPCOUNT_FIELD.label = 2
BSEBATTLEADDROLE_CAMPCOUNT_FIELD.has_default_value = false
BSEBATTLEADDROLE_CAMPCOUNT_FIELD.default_value = 0
BSEBATTLEADDROLE_CAMPCOUNT_FIELD.type = 13
BSEBATTLEADDROLE_CAMPCOUNT_FIELD.cpp_type = 3

BSEBATTLEADDROLE_ROLEARR_FIELD.name = "roleArr"
BSEBATTLEADDROLE_ROLEARR_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseBattleAddRole.roleArr"
BSEBATTLEADDROLE_ROLEARR_FIELD.number = 5
BSEBATTLEADDROLE_ROLEARR_FIELD.index = 2
BSEBATTLEADDROLE_ROLEARR_FIELD.label = 3
BSEBATTLEADDROLE_ROLEARR_FIELD.has_default_value = false
BSEBATTLEADDROLE_ROLEARR_FIELD.default_value = {}
BSEBATTLEADDROLE_ROLEARR_FIELD.message_type = ROLEINFO_PB_ROLEINFO
BSEBATTLEADDROLE_ROLEARR_FIELD.type = 11
BSEBATTLEADDROLE_ROLEARR_FIELD.cpp_type = 10

BSEBATTLEADDROLE.name = "BseBattleAddRole"
BSEBATTLEADDROLE.full_name = ".com.xinqihd.sns.gameserver.proto.BseBattleAddRole"
BSEBATTLEADDROLE.nested_types = {}
BSEBATTLEADDROLE.enum_types = {}
BSEBATTLEADDROLE.fields = {BSEBATTLEADDROLE_ROOMID_FIELD, BSEBATTLEADDROLE_CAMPCOUNT_FIELD, BSEBATTLEADDROLE_ROLEARR_FIELD}
BSEBATTLEADDROLE.is_extendable = false
BSEBATTLEADDROLE.extensions = {}

BseBattleAddRole = protobuf.Message(BSEBATTLEADDROLE)
_G.BSEBATTLEADDROLE_PB_BSEBATTLEADDROLE = BSEBATTLEADDROLE
