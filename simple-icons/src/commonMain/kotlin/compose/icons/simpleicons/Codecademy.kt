package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Codecademy: VectorAsset
    get() {
        if (_codecademy != null) {
            return _codecademy!!
        }
        _codecademy = VectorAssetBuilder(name = "Codecademy", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.827f, 19.73f)
                horizontalLineToRelative(-5.595f)
                curveToRelative(-0.094f, 0.0f, -0.17f, 0.058f, -0.17f, 0.172f)
                verticalLineToRelative(1.515f)
                curveToRelative(0.0f, 0.094f, 0.058f, 0.17f, 0.172f, 0.17f)
                horizontalLineToRelative(5.594f)
                curveToRelative(0.096f, 0.0f, 0.172f, -0.044f, 0.172f, -0.164f)
                verticalLineToRelative(-1.515f)
                curveToRelative(0.0f, -0.105f, -0.057f, -0.166f, -0.173f, -0.166f)
                verticalLineToRelative(-0.014f)
                verticalLineToRelative(0.002f)
                close()
                moveTo(16.463f, 2.465f)
                curveToRelative(0.016f, 0.035f, 0.03f, 0.068f, 0.047f, 0.12f)
                verticalLineToRelative(18.79f)
                curveToRelative(0.0f, 0.061f, -0.02f, 0.096f, -0.037f, 0.114f)
                arcToRelative(0.168f, 0.168f, 0.0f, false, true, -0.135f, 0.06f)
                lineTo(0.153f, 21.549f)
                curveToRelative(-0.038f, 0.0f, -0.075f, 0.0f, -0.097f, -0.02f)
                arcTo(0.181f, 0.181f, 0.0f, false, true, 0.0f, 21.395f)
                lineTo(0.0f, 2.566f)
                curveToRelative(0.0f, -0.076f, 0.04f, -0.134f, 0.096f, -0.15f)
                horizontalLineToRelative(16.242f)
                curveToRelative(0.04f, 0.0f, 0.096f, 0.017f, 0.115f, 0.034f)
                verticalLineToRelative(0.016f)
                lineToRelative(0.01f, -0.001f)
                close()
                moveTo(1.818f, 19.575f)
                curveToRelative(0.0f, 0.073f, 0.038f, 0.136f, 0.096f, 0.153f)
                horizontalLineToRelative(12.643f)
                curveToRelative(0.058f, -0.019f, 0.096f, -0.076f, 0.096f, -0.154f)
                lineTo(14.653f, 4.404f)
                curveToRelative(0.0f, -0.073f, -0.039f, -0.134f, -0.098f, -0.15f)
                lineTo(1.915f, 4.254f)
                curveToRelative(-0.056f, 0.02f, -0.096f, 0.073f, -0.096f, 0.15f)
                lineToRelative(-0.003f, 15.17f)
                lineToRelative(0.002f, 0.001f)
                close()
                moveTo(6.992f, 11.201f)
                curveToRelative(0.65f, 0.0f, 1.014f, 0.177f, 1.396f, 0.619f)
                curveToRelative(0.058f, 0.075f, 0.153f, 0.094f, 0.23f, 0.035f)
                lineToRelative(1.034f, -0.92f)
                curveToRelative(0.075f, -0.044f, 0.058f, -0.164f, 0.02f, -0.224f)
                curveToRelative(-0.635f, -0.764f, -1.554f, -1.244f, -2.74f, -1.244f)
                curveToRelative(-1.59f, 0.0f, -2.79f, 0.795f, -3.255f, 2.206f)
                curveToRelative(-0.165f, 0.495f, -0.24f, 1.126f, -0.24f, 1.979f)
                curveToRelative(0.0f, 0.855f, 0.075f, 1.484f, 0.255f, 1.98f)
                curveToRelative(0.465f, 1.426f, 1.665f, 2.205f, 3.255f, 2.205f)
                curveToRelative(1.2f, 0.0f, 2.115f, -0.48f, 2.745f, -1.216f)
                curveToRelative(0.045f, -0.074f, 0.06f, -0.165f, -0.015f, -0.226f)
                lineTo(8.64f, 15.48f)
                curveToRelative(-0.073f, -0.047f, -0.163f, -0.047f, -0.224f, 0.027f)
                curveToRelative(-0.39f, 0.45f, -0.795f, 0.69f, -1.454f, 0.69f)
                curveToRelative(-0.706f, 0.0f, -1.245f, -0.345f, -1.47f, -1.035f)
                curveToRelative(-0.136f, -0.39f, -0.166f, -0.87f, -0.166f, -1.483f)
                curveToRelative(0.0f, -0.615f, 0.045f, -1.068f, 0.18f, -1.471f)
                curveToRelative(0.24f, -0.659f, 0.766f, -1.007f, 1.486f, -1.007f)
                close()
            }
        }
        .build()
        return _codecademy!!
    }

private var _codecademy: VectorAsset? = null