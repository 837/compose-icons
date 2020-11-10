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

public val SimpleIcons.Openvpn: VectorAsset
    get() {
        if (_openvpn != null) {
            return _openvpn!!
        }
        _openvpn = VectorAssetBuilder(name = "Openvpn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.365f)
                curveTo(5.385f, 0.365f, 0.0f, 5.697f, 0.0f, 12.26f)
                curveToRelative(0.0f, 4.36f, 2.358f, 8.154f, 5.896f, 10.205f)
                lineToRelative(0.77f, -5.076f)
                arcTo(7.046f, 7.046f, 0.0f, false, true, 4.82f, 12.67f)
                curveToRelative(0.0f, -3.897f, 3.18f, -7.076f, 7.13f, -7.076f)
                curveToRelative(3.948f, 0.0f, 7.126f, 3.179f, 7.126f, 7.076f)
                curveToRelative(0.0f, 1.847f, -0.717f, 3.488f, -1.846f, 4.77f)
                lineToRelative(0.77f, 5.078f)
                curveToRelative(3.59f, -2.051f, 6.0f, -5.899f, 6.0f, -10.258f)
                curveTo(24.0f, 5.697f, 18.615f, 0.365f, 12.0f, 0.365f)
                close()
                moveTo(11.95f, 8.521f)
                arcToRelative(3.786f, 3.786f, 0.0f, false, false, -3.796f, 3.795f)
                arcToRelative(3.738f, 3.738f, 0.0f, false, false, 2.461f, 3.54f)
                lineTo(9.13f, 23.65f)
                horizontalLineToRelative(5.64f)
                lineToRelative(-1.435f, -7.795f)
                curveToRelative(1.385f, -0.564f, 2.41f, -1.898f, 2.41f, -3.539f)
                arcToRelative(3.786f, 3.786f, 0.0f, false, false, -3.795f, -3.795f)
                close()
            }
        }
        .build()
        return _openvpn!!
    }

private var _openvpn: VectorAsset? = null