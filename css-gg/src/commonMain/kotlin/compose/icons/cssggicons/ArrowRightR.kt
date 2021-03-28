package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
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

public val CssGgIcons.ArrowRightR: ImageVector
    get() {
        if (_arrowRightR != null) {
            return _arrowRightR!!
        }
        _arrowRightR = Builder(name = "ArrowRightR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0519f, 14.8285f)
                lineTo(13.4661f, 16.2427f)
                lineTo(17.7087f, 12.0f)
                lineTo(13.4661f, 7.7574f)
                lineTo(12.0519f, 9.1716f)
                lineTo(13.8803f, 11.0f)
                horizontalLineTo(6.3432f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.8803f)
                lineTo(12.0519f, 14.8285f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 19.0f)
                curveTo(1.0f, 21.2091f, 2.7909f, 23.0f, 5.0f, 23.0f)
                horizontalLineTo(19.0f)
                curveTo(21.2091f, 23.0f, 23.0f, 21.2091f, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 2.7909f, 21.2091f, 1.0f, 19.0f, 1.0f)
                horizontalLineTo(5.0f)
                curveTo(2.7909f, 1.0f, 1.0f, 2.7909f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 21.0f, 21.0f, 20.1046f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.8954f, 20.1046f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.8954f, 3.0f, 3.0f, 3.8954f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1046f, 3.8954f, 21.0f, 5.0f, 21.0f)
                close()
            }
        }
        .build()
        return _arrowRightR!!
    }

private var _arrowRightR: ImageVector? = null
