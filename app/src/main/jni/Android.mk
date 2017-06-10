LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := HellowWord
LOCAL_SRC_FILES =: HelloWord.c
include $(BUILD_SHARED_LIBRARY)