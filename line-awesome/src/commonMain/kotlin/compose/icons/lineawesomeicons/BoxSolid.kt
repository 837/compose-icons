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

public val LineAwesomeIcons.BoxSolid: ImageVector
    get() {
        if (_boxSolid != null) {
            return _boxSolid!!
        }
        _boxSolid = Builder(name = "BoxSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.0f)
                lineTo(8.1875f, 5.4063f)
                lineTo(5.0f, 9.6563f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 9.6563f)
                lineTo(23.8125f, 5.4063f)
                lineTo(23.5f, 5.0f)
                close()
                moveTo(9.5f, 7.0f)
                lineTo(15.0f, 7.0f)
                lineTo(15.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                close()
                moveTo(17.0f, 7.0f)
                lineTo(22.5f, 7.0f)
                lineTo(24.0f, 9.0f)
                lineTo(17.0f, 9.0f)
                close()
                moveTo(7.0f, 11.0f)
                lineTo(25.0f, 11.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
                moveTo(12.8125f, 13.0f)
                curveTo(12.2617f, 13.0508f, 11.8555f, 13.543f, 11.9063f, 14.0938f)
                curveTo(11.957f, 14.6445f, 12.4492f, 15.0508f, 13.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                curveTo(19.3594f, 15.0039f, 19.6953f, 14.8164f, 19.8789f, 14.5039f)
                curveTo(20.0586f, 14.1914f, 20.0586f, 13.8086f, 19.8789f, 13.4961f)
                curveTo(19.6953f, 13.1836f, 19.3594f, 12.9961f, 19.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                curveTo(12.9688f, 13.0f, 12.9375f, 13.0f, 12.9063f, 13.0f)
                curveTo(12.875f, 13.0f, 12.8438f, 13.0f, 12.8125f, 13.0f)
                close()
            }
        }
        .build()
        return _boxSolid!!
    }

private var _boxSolid: ImageVector? = null
