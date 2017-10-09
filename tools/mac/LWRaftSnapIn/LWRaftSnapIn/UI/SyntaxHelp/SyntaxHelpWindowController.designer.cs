/*
 * Copyright © 2012-2017 VMware, Inc.  All Rights Reserved.
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

// WARNING
//
// This file has been generated automatically by Xamarin Studio to store outlets and
// actions made in the UI designer. If it is removed, they will be lost.
// Manual changes to this file may not be handled correctly.
//
using Foundation;
using System.CodeDom.Compiler;

namespace LWRaftSnapIn.UI
{
	[Register ("SyntaxHelpWindowController")]
	partial class SyntaxHelpWindowController
	{
		[Outlet]
		AppKit.NSTextView ExampleTextView { get; set; }

		[Outlet]
		AppKit.NSTextField MoreInfoTextField { get; set; }

		[Outlet]
		AppKit.NSTextField NameTextField { get; set; }

		[Outlet]
		AppKit.NSTextField SyntaxTextField { get; set; }

		[Action ("OnCancel:")]
		partial void OnCancel (Foundation.NSObject sender);
		
		void ReleaseDesignerOutlets ()
		{
			if (ExampleTextView != null) {
				ExampleTextView.Dispose ();
				ExampleTextView = null;
			}

			if (NameTextField != null) {
				NameTextField.Dispose ();
				NameTextField = null;
			}

			if (SyntaxTextField != null) {
				SyntaxTextField.Dispose ();
				SyntaxTextField = null;
			}

			if (MoreInfoTextField != null) {
				MoreInfoTextField.Dispose ();
				MoreInfoTextField = null;
			}
		}
	}
}
