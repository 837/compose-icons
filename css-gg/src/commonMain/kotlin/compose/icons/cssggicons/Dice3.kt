package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.Dice3: ImageVector
    get() {
        if (_dice3 != null) {
            return _dice3!!
        }
        _dice3 = Builder(name = "Dice3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                curveTo(10.0f, 10.8954f, 10.8954f, 10.0f, 12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 10.8954f, 14.0f, 12.0f)
                curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 13.1046f, 10.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9451f, 14.8921f)
                curveTo(15.8405f, 14.8921f, 14.9451f, 15.7875f, 14.9451f, 16.8921f)
                curveTo(14.9451f, 17.9967f, 15.8405f, 18.8921f, 16.9451f, 18.8921f)
                curveTo(18.0496f, 18.8921f, 18.9451f, 17.9967f, 18.9451f, 16.8921f)
                curveTo(18.9451f, 15.7875f, 18.0496f, 14.8921f, 16.9451f, 14.8921f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0552f, 7.0552f)
                curveTo(5.0552f, 5.9506f, 5.9506f, 5.0552f, 7.0552f, 5.0552f)
                curveTo(8.1597f, 5.0552f, 9.0552f, 5.9506f, 9.0552f, 7.0552f)
                curveTo(9.0552f, 8.1597f, 8.1597f, 9.0552f, 7.0552f, 9.0552f)
                curveTo(5.9506f, 9.0552f, 5.0552f, 8.1597f, 5.0552f, 7.0552f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 4.0f)
                curveTo(1.0f, 2.3431f, 2.3431f, 1.0f, 4.0f, 1.0f)
                horizontalLineTo(20.0f)
                curveTo(21.6569f, 1.0f, 23.0f, 2.3431f, 23.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(23.0f, 21.6569f, 21.6569f, 23.0f, 20.0f, 23.0f)
                horizontalLineTo(4.0f)
                curveTo(2.3431f, 23.0f, 1.0f, 21.6569f, 1.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                close()
            }
        }
        .build()
        return _dice3!!
    }

private var _dice3: ImageVector? = null
