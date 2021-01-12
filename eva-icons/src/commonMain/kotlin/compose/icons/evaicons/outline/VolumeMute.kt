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

public val OutlineGroup.VolumeMute: VectorAsset
    get() {
        if (_volumeMute != null) {
            return _volumeMute!!
        }
        _volumeMute = VectorAssetBuilder(name = "VolumeMute", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(17.0f, 21.0f)
                arcToRelative(1.06f, 1.06f, 0.0f, false, true, -0.57f, -0.17f)
                lineTo(10.0f, 16.43f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(8.57f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(6.41f, -4.4f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 4.0f)
                verticalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(6.0f, 14.43f)
                horizontalLineToRelative(4.33f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.57f, 0.17f)
                lineTo(16.0f, 18.1f)
                verticalLineTo(5.9f)
                lineTo(10.9f, 9.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.57f, 0.17f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _volumeMute!!
    }

private var _volumeMute: VectorAsset? = null
