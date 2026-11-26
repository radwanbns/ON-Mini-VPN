package com.onminivpn.app

import android.net.VpnService

/**
 * VPN service foundation only.
 * A real tunnel engine must be integrated before establishing a VPN connection.
 */
class MiniVpnService : VpnService()
