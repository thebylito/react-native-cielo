using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Cielo.RNCielo
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNCieloModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNCieloModule"/>.
        /// </summary>
        internal RNCieloModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNCielo";
            }
        }
    }
}
