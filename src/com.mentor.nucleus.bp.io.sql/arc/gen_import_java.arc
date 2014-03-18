.//====================================================================
.//
.// File:      $RCSfile: gen_import_java.arc,v $
.// Version:   $Revision: 1.41 $
.// Modified:  $Date: 2013/05/10 16:18:02 $
.//
.// (c) Copyright 2004-2014 by Mentor Graphics Corp.  All rights reserved.
.//
.//====================================================================
.//
.// Generate the Java code that validates/translates data from BP SQL
.// into a format that Tiger uses.
.//
.//====================================================================
.//
.assign io_core = "../com.mentor.nucleus.bp.io.core"
.assign class_name = "ImportBPSql"
.//
.// special case GD_MD.Model_ID is referential in 7.1 
.select any table from instances of T where selected.Key_Lett ==  "GD_MD"
.select one col related by table->C[R5] where selected.Name == "Model_ID"
.assign col.isReferential = true
.//
.include "${io_core}/arc/gen_import_java.inc"
.invoke result = gen_import("BP", "${class_name}", false, "6.1D", false) 
//========================================================================
//
// File: ${class_name}.java
//
// WARNING:      Do not edit this generated file
// Generated by: ${info.arch_file_name}
// Version:      $$Revision: 1.41 $$
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//========================================================================
// Licensed under the Apache License, Version 2.0 (the "License"); you may not 
// use this file except in compliance with the License.  You may obtain a copy 
// of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
// WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   See the 
// License for the specific language governing permissions and limitations under
// the License.
//======================================================================== 
//
${result.body}
.//
.emit to file "src/com/mentor/nucleus/bp/io/sql/${class_name}.java"
.//