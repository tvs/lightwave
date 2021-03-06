/*
 * Copyright © 2012-2015 VMware, Inc.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the “License”); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an “AS IS” BASIS, without
 * warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */



/*prototypes.h*/

DWORD
VmDirParseArgs(
    int      argc,
    char*    argv[],
    PSTR*    ppszFeatureSet,
    PBOOLEAN pbTwoWayRepl,
    PSTR*    ppszSrcHostName,
    PSTR*    ppszSrcPort,
    PSTR*    ppszSrcUserName,
    PSTR*    ppszSrcPassword,
    PSTR*    ppszTgtHostName,
    PSTR*    ppszTgtPort,
    PSTR*    ppszEntryDn,
    PSTR*    ppszAttribute,
    PSTR*    ppszSiteName,
    PBOOLEAN pbVerbose,
    PBOOLEAN pbNoInteraction,
    PBOOLEAN pIncludeOffline
    );

VOID
ShowUsage(
    VOID
    );

DWORD
VmDirEnableRedundantTopology(
    BOOLEAN             bNoInteraction,
    BOOLEAN             bIncludeOffline,
    PCSTR               pszSrcHostName,
    PCSTR               pszSrcPort,
    PCSTR               pszSrcUserName,
    PCSTR               pszSrcPassword,
    PCSTR               pszSiteName
    );
