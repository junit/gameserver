-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceServerList_pb', package.seeall)


local BCESERVERLIST = protobuf.Descriptor();
local BCESERVERLIST_ACCOUNTID_FIELD = protobuf.FieldDescriptor();
local BCESERVERLIST_ACCOUNTNAME_FIELD = protobuf.FieldDescriptor();

BCESERVERLIST_ACCOUNTID_FIELD.name = "accountId"
BCESERVERLIST_ACCOUNTID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceServerList.accountId"
BCESERVERLIST_ACCOUNTID_FIELD.number = 1
BCESERVERLIST_ACCOUNTID_FIELD.index = 0
BCESERVERLIST_ACCOUNTID_FIELD.label = 1
BCESERVERLIST_ACCOUNTID_FIELD.has_default_value = false
BCESERVERLIST_ACCOUNTID_FIELD.default_value = ""
BCESERVERLIST_ACCOUNTID_FIELD.type = 9
BCESERVERLIST_ACCOUNTID_FIELD.cpp_type = 9

BCESERVERLIST_ACCOUNTNAME_FIELD.name = "accountname"
BCESERVERLIST_ACCOUNTNAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceServerList.accountname"
BCESERVERLIST_ACCOUNTNAME_FIELD.number = 2
BCESERVERLIST_ACCOUNTNAME_FIELD.index = 1
BCESERVERLIST_ACCOUNTNAME_FIELD.label = 1
BCESERVERLIST_ACCOUNTNAME_FIELD.has_default_value = false
BCESERVERLIST_ACCOUNTNAME_FIELD.default_value = ""
BCESERVERLIST_ACCOUNTNAME_FIELD.type = 9
BCESERVERLIST_ACCOUNTNAME_FIELD.cpp_type = 9

BCESERVERLIST.name = "BceServerList"
BCESERVERLIST.full_name = ".com.xinqihd.sns.gameserver.proto.BceServerList"
BCESERVERLIST.nested_types = {}
BCESERVERLIST.enum_types = {}
BCESERVERLIST.fields = {BCESERVERLIST_ACCOUNTID_FIELD, BCESERVERLIST_ACCOUNTNAME_FIELD}
BCESERVERLIST.is_extendable = false
BCESERVERLIST.extensions = {}

BceServerList = protobuf.Message(BCESERVERLIST)
_G.BCESERVERLIST_PB_BCESERVERLIST = BCESERVERLIST
