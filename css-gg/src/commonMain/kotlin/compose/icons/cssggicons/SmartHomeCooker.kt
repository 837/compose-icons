package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.EvenOdd
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

public val CssGgIcons.SmartHomeCooker: ImageVector
    get() {
        if (_smartHomeCooker != null) {
            return _smartHomeCooker!!
        }
        _smartHomeCooker = Builder(name = "SmartHomeCooker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 16.0f)
                curveTo(15.0f, 17.6569f, 13.6569f, 19.0f, 12.0f, 19.0f)
                curveTo(10.3431f, 19.0f, 9.0f, 17.6569f, 9.0f, 16.0f)
                curveTo(9.0f, 14.3431f, 10.3431f, 13.0f, 12.0f, 13.0f)
                curveTo(13.6569f, 13.0f, 15.0f, 14.3431f, 15.0f, 16.0f)
                close()
                moveTo(13.0f, 16.0f)
                curveTo(13.0f, 16.5523f, 12.5523f, 17.0f, 12.0f, 17.0f)
                curveTo(11.4477f, 17.0f, 11.0f, 16.5523f, 11.0f, 16.0f)
                curveTo(11.0f, 15.4477f, 11.4477f, 15.0f, 12.0f, 15.0f)
                curveTo(12.5523f, 15.0f, 13.0f, 15.4477f, 13.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                curveTo(4.7909f, 5.0f, 3.0f, 6.7909f, 3.0f, 9.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 21.2091f, 4.7909f, 23.0f, 7.0f, 23.0f)
                horizontalLineTo(17.0f)
                curveTo(19.2091f, 23.0f, 21.0f, 21.2091f, 21.0f, 19.0f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 6.7909f, 19.2091f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(1.0f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineTo(7.0f)
                curveTo(5.8954f, 7.0f, 5.0f, 7.8954f, 5.0f, 9.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 7.8954f, 18.1046f, 7.0f, 17.0f, 7.0f)
                close()
                moveTo(19.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                curveTo(5.0f, 20.1046f, 5.8954f, 21.0f, 7.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1046f, 21.0f, 19.0f, 20.1046f, 19.0f, 19.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _smartHomeCooker!!
    }

private var _smartHomeCooker: ImageVector? = null
