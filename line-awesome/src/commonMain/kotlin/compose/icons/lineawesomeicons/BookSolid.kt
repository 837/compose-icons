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

public val LineAwesomeIcons.BookSolid: ImageVector
    get() {
        if (_bookSolid != null) {
            return _bookSolid!!
        }
        _bookSolid = Builder(name = "BookSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveTo(7.3555f, 4.0f, 6.0f, 5.3555f, 6.0f, 7.0f)
                lineTo(6.0f, 25.0f)
                curveTo(6.0f, 26.6445f, 7.3555f, 28.0f, 9.0f, 28.0f)
                lineTo(26.0f, 28.0f)
                lineTo(26.0f, 4.0f)
                close()
                moveTo(9.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                lineTo(24.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                curveTo(8.6484f, 22.0f, 8.3164f, 22.0742f, 8.0f, 22.1875f)
                lineTo(8.0f, 7.0f)
                curveTo(8.0f, 6.4336f, 8.4336f, 6.0f, 9.0f, 6.0f)
                close()
                moveTo(11.0f, 9.0f)
                lineTo(11.0f, 11.0f)
                lineTo(22.0f, 11.0f)
                lineTo(22.0f, 9.0f)
                close()
                moveTo(9.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 26.0f)
                lineTo(9.0f, 26.0f)
                curveTo(8.4336f, 26.0f, 8.0f, 25.5664f, 8.0f, 25.0f)
                curveTo(8.0f, 24.4336f, 8.4336f, 24.0f, 9.0f, 24.0f)
                close()
            }
        }
        .build()
        return _bookSolid!!
    }

private var _bookSolid: ImageVector? = null
