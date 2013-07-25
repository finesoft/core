#!/bin/sh

cd ./examples/container-pojosr/target/weld-osgi-container-lite-all/weld-osgi-container-lite/;

LIBS=./modules
LIBS_CLASSPATH=`find $LIBS -type f -name \*.jar` 
LIBS_CLASSPATH=`echo $LIBS_CLASSPATH | tr ' ' ':'`

java -cp bin/pojosr.jar:$LIBS_CLASSPATH de.kalpatec.pojosr.framework.PojoSR
