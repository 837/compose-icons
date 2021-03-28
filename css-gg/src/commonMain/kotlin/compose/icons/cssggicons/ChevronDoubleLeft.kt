package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ChevronDoubleLeft: ImageVector
    get() {
        if (_chevronDoubleLeft != null) {
            return _chevronDoubleLeft!!
        }
        _chevronDoubleLeft = Builder(name = "ChevronDoubleLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3639f, 7.7573f)
                lineTo(16.9497f, 6.3431f)
                lineTo(11.2929f, 12.0f)
                lineTo(16.9497f, 17.6568f)
                lineTo(18.3639f, 16.2426f)
                lineTo(14.1213f, 12.0f)
                lineTo(18.3639f, 7.7573f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2929f, 6.3431f)
                lineTo(12.7071f, 7.7573f)
                lineTo(8.4645f, 12.0f)
                lineTo(12.7071f, 16.2426f)
                lineTo(11.2929f, 17.6568f)
                lineTo(5.6361f, 12.0f)
                lineTo(11.2929f, 6.3431f)
                close()
            }
        }
        .build()
        return _chevronDoubleLeft!!
    }

private var _chevronDoubleLeft: ImageVector? = null
