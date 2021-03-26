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

public val LineAwesomeIcons.ParkingSolid: ImageVector
    get() {
        if (_parkingSolid != null) {
            return _parkingSolid!!
        }
        _parkingSolid = Builder(name = "ParkingSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                lineTo(6.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                lineTo(26.0f, 5.0f)
                close()
                moveTo(8.0f, 7.0f)
                lineTo(24.0f, 7.0f)
                lineTo(24.0f, 25.0f)
                lineTo(8.0f, 25.0f)
                close()
                moveTo(12.0f, 10.0f)
                lineTo(12.0f, 22.0f)
                lineTo(14.0f, 22.0f)
                lineTo(14.0f, 19.0f)
                lineTo(17.0f, 19.0f)
                curveTo(18.6445f, 19.0f, 20.0f, 17.6445f, 20.0f, 16.0f)
                lineTo(20.0f, 13.0f)
                curveTo(20.0f, 11.3555f, 18.6445f, 10.0f, 17.0f, 10.0f)
                close()
                moveTo(14.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                curveTo(17.5664f, 12.0f, 18.0f, 12.4336f, 18.0f, 13.0f)
                lineTo(18.0f, 16.0f)
                curveTo(18.0f, 16.5664f, 17.5664f, 17.0f, 17.0f, 17.0f)
                lineTo(14.0f, 17.0f)
                close()
            }
        }
        .build()
        return _parkingSolid!!
    }

private var _parkingSolid: ImageVector? = null
