package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.ArrowBigDown: VectorAsset
    get() {
        if (_arrowBigDown != null) {
            return _arrowBigDown!!
        }
        _arrowBigDown = VectorAssetBuilder(name = "ArrowBigDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.707f, 1.707f)
                lineToRelative(-6.586f, 6.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-6.586f, -6.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.707f, -1.707f)
                horizontalLineToRelative(3.586f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _arrowBigDown!!
    }

private var _arrowBigDown: VectorAsset? = null