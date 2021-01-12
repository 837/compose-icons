package compose.icons.evaicons.fill

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
import compose.icons.evaicons.FillGroup

public val FillGroup.Shuffle2: VectorAsset
    get() {
        if (_shuffle2 != null) {
            return _shuffle2!!
        }
        _shuffle2 = VectorAssetBuilder(name = "Shuffle2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineToRelative(-24.0f, -0.0f)
                lineToRelative(-0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.71f, 14.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 1.42f)
                lineToRelative(0.29f, 0.29f)
                horizontalLineTo(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(1.59f)
                lineToRelative(-0.3f, 0.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.71f, -0.29f)
                lineToRelative(2.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.29f, -0.71f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 1.42f)
                lineToRelative(0.29f, 0.29f)
                horizontalLineTo(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 2.69f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 8.0f)
                horizontalLineTo(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, -2.69f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 16.0f, 18.0f)
                horizontalLineToRelative(1.59f)
                lineToRelative(-0.3f, 0.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.71f, -0.29f)
                lineToRelative(2.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.29f, -0.71f)
                close()
            }
        }
        .build()
        return _shuffle2!!
    }

private var _shuffle2: VectorAsset? = null
