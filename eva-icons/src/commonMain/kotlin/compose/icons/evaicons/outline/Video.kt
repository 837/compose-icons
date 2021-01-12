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

public val OutlineGroup.Video: VectorAsset
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = VectorAssetBuilder(name = "Video", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(21.0f, 7.15f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -1.85f, 0.3f)
                lineTo(17.0f, 9.45f)
                lineTo(17.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(5.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(17.0f, 14.55f)
                lineToRelative(2.16f, 2.0f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, false, 1.16f, 0.45f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, false, 0.69f, -0.15f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 1.0f, -1.48f)
                lineTo(22.01f, 8.63f)
                arcTo(1.6f, 1.6f, 0.0f, false, false, 21.0f, 7.15f)
                close()
                moveTo(15.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(5.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(4.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 7.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(20.0f, 14.6f)
                lineTo(17.19f, 12.0f)
                lineTo(20.0f, 9.4f)
                close()
            }
        }
        .build()
        return _video!!
    }

private var _video: VectorAsset? = null
