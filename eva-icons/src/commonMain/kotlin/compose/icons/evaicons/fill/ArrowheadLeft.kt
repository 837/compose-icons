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

public val FillGroup.ArrowheadLeft: VectorAsset
    get() {
        if (_arrowheadLeft != null) {
            return _arrowheadLeft!!
        }
        _arrowheadLeft = VectorAssetBuilder(name = "ArrowheadLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                lineToRelative(-0.0f, 24.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(-0.0f, -24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.64f, 5.23f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.13f)
                lineToRelative(-5.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.27f)
                lineToRelative(4.83f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, 0.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, -1.63f)
                lineTo(7.29f, 12.0f)
                lineToRelative(4.48f, -5.37f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.64f, 5.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.29f, 12.0f)
                lineToRelative(4.48f, -5.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.54f, -1.28f)
                lineToRelative(-5.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.27f)
                lineToRelative(4.83f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, 0.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, -1.63f)
                close()
            }
        }
        .build()
        return _arrowheadLeft!!
    }

private var _arrowheadLeft: VectorAsset? = null
