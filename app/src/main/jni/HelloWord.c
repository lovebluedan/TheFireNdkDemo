//
// Created by 林丹荣 on 2017/6/10.
//

#include "HelloWord.h"
#include <stdio.h>
#include <stdlib.h>
#include "com_example_thefirendkdemo_MainActivity.h"
JNIEXPORT jstring JNICALL Java_com_example_thefirendkdemo_MainActivity_getStringFromActivity
        (JNIEnv * env,jobject jobject)
{
    return (*env)->NewStringUTF(env,"Hellow from JNI");
}

