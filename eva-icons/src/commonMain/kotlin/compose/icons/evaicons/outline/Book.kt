package compose.icons.evaicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Book: VectorAsset
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = VectorAssetBuilder(name = "Book", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.0f, 6.0f)
                verticalLineTo(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 3.0f)
                close()
                moveTo(7.0f, 5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.0f, 0.18f)
                verticalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 5.0f)
                close()
                moveTo(7.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _book!!
    }

private var _book: VectorAsset? = null
