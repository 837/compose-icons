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

public val CssGgIcons.FileRemove: ImageVector
    get() {
        if (_fileRemove != null) {
            return _fileRemove!!
        }
        _fileRemove = Builder(name = "FileRemove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 2.0f)
                curveTo(4.3432f, 2.0f, 3.0f, 3.3431f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.6569f, 4.3432f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 22.0f, 21.0f, 20.6569f, 21.0f, 19.0f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 5.134f, 17.866f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(6.0f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                curveTo(19.0f, 19.5523f, 18.5523f, 20.0f, 18.0f, 20.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 20.0f, 5.0f, 19.5523f, 5.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 4.4477f, 5.4477f, 4.0f, 6.0f, 4.0f)
                close()
                moveTo(15.0f, 4.1f)
                curveTo(16.6113f, 4.4271f, 17.9413f, 5.5291f, 18.584f, 7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.1f)
                close()
            }
        }
        .build()
        return _fileRemove!!
    }

private var _fileRemove: ImageVector? = null
