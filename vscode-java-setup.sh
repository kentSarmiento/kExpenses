#!/bin/bash

PJ_NAME=$1

VSCODE_WS="${PJ_NAME}.code-workspace"
touch $VSCODE_WS

# TODO: Update this part
echo "{"                          > $VSCODE_WS
echo "	\"folders\": ["           >> $VSCODE_WS
echo "		{"                    >> $VSCODE_WS
echo "			\"path\": \".\""  >> $VSCODE_WS
echo "		}"                    >> $VSCODE_WS
echo "	]"                        >> $VSCODE_WS
echo "}"                          >> $VSCODE_WS

# Create directories
mkdir build
mkdir lib
mkdir src
mkdir test

# Create build file for ant
