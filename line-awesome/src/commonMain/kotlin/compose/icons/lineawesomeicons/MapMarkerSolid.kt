package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.MapMarkerSolid: ImageVector
    get() {
        if (_mapMarkerSolid != null) {
            return _mapMarkerSolid!!
        }
        _mapMarkerSolid = Builder(name = "MapMarkerSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(11.043f, 3.0f, 7.0f, 7.043f, 7.0f, 12.0f)
                curveTo(7.0f, 13.4063f, 7.5703f, 15.0195f, 8.3438f, 16.7813f)
                curveTo(9.1172f, 18.543f, 10.1133f, 20.4141f, 11.125f, 22.1563f)
                curveTo(13.1484f, 25.6445f, 15.1875f, 28.5625f, 15.1875f, 28.5625f)
                lineTo(16.0f, 29.75f)
                lineTo(16.8125f, 28.5625f)
                curveTo(16.8125f, 28.5625f, 18.8516f, 25.6445f, 20.875f, 22.1563f)
                curveTo(21.8867f, 20.4141f, 22.8828f, 18.543f, 23.6563f, 16.7813f)
                curveTo(24.4297f, 15.0195f, 25.0f, 13.4063f, 25.0f, 12.0f)
                curveTo(25.0f, 7.043f, 20.957f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(19.8789f, 5.0f, 23.0f, 8.1211f, 23.0f, 12.0f)
                curveTo(23.0f, 12.8008f, 22.5703f, 14.3164f, 21.8438f, 15.9688f)
                curveTo(21.1172f, 17.6211f, 20.1133f, 19.4531f, 19.125f, 21.1563f)
                curveTo(17.5547f, 23.8672f, 16.5781f, 25.3008f, 16.0f, 26.1563f)
                curveTo(15.4219f, 25.3008f, 14.4453f, 23.8672f, 12.875f, 21.1563f)
                curveTo(11.8867f, 19.4531f, 10.8828f, 17.6211f, 10.1563f, 15.9688f)
                curveTo(9.4297f, 14.3164f, 9.0f, 12.8008f, 9.0f, 12.0f)
                curveTo(9.0f, 8.1211f, 12.1211f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(14.8945f, 10.0f, 14.0f, 10.8945f, 14.0f, 12.0f)
                curveTo(14.0f, 13.1055f, 14.8945f, 14.0f, 16.0f, 14.0f)
                curveTo(17.1055f, 14.0f, 18.0f, 13.1055f, 18.0f, 12.0f)
                curveTo(18.0f, 10.8945f, 17.1055f, 10.0f, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _mapMarkerSolid!!
    }

private var _mapMarkerSolid: ImageVector? = null
